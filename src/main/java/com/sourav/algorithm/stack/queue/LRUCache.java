package com.sourav.algorithm.stack.queue;

import java.util.*;

public class LRUCache {
	
    LinkedHashSet<Integer> set;
    Deque<Integer> cache;
    int capacity;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        set = new LinkedHashSet<>(capacity);
        cache = new LinkedList<>();
    }

    public void look(int key) { 
    	//Linked Hash Set will be used to check if the item is present in the cache in O(1) time. Deque operations take O(N) time
        if(set.contains(key)){
            //remove it from cache so that it can be added at front of the cache
            cache.remove(key);
        } else{
            //not already in cache, adding it
            if(cache.size()==capacity){
                //remove the last one from cache
                int last = cache.removeLast();
                set.remove(last);
            }
        }
        //add it to cache
        cache.push(key);
        set.add(key);
        System.out.println("Looking for key: " + key);
        printCache();
    }

    public void printCache(){
        System.out.print("Cache: ");
        Iterator<Integer> iterator = cache.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int capacity = 4;
        LRUCache lru = new LRUCache(capacity);
        lru.look(1);
        lru.look(2);
        lru.look(1);
        lru.look(3);
        lru.look(4);
        lru.look(3);
        lru.look(5);
        lru.look(4);
        lru.look(6);
    }
    
    
    //https://tutorialhorizon.com/algorithms/least-recently-used-lru-cache-using-linkedhashset-and-deque-set-2/#:~:text=Deque%3A%20The%20Deque%20list%20will,the%20new%20item%20is%20inserted
}
