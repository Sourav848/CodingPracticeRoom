package com.sourav.array.problems;

public class ZeroOneTwoSorting {
	
	
	public static void main(String[] args) {
		 int arr[] = {0, 2, 1, 2, 0};
		 
		 sort012(arr, arr.length);
		
	}
	
	
	
	public static void sort012(int a[], int n)
    {
        // code here 
        int cnt0 = 0, cnt1 = 0, cnt2 = 0;
        
        for (int i = 0; i < n; i++){
            int value = a[i];
            
            switch (value) {
            case 0 : cnt0++;
                     break;
            case 1 : cnt1++;
                     break;
            case 2 : cnt2++;
                     break;
            }
        }
        
        int j = 0;
        while (cnt0>0){
            a[j] = 0;
            j++;
            cnt0--;
        }
        while (cnt1>0){
            a[j] = 1;
            j++;
            cnt1--;
        }
        while (cnt2>0){
            a[j] = 2;
            j++;
            cnt2--;
        }
        for (int i = 0; i < n; i++){ 
            System.out.print(a[i]+ " ");
        }
        
    }

}
