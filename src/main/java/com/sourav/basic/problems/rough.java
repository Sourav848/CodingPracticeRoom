package com.sourav.basic.problems;

import java.util.Scanner;



class rough {
    public static void main(String args[] ) throws Exception {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0;i<n;i++) {
            String inputData = sc.next();
            codeHere(inputData,0,inputData.length());
            System.out.println();
        }
    }
    public static void codeHere(String inputData, int first, int last) {
        // Use this function to write your solution;
        if (first == last-1)
          System.out.print(inputData + " ");
        else
         {
             for (int i = first; i<last;i++) {
                 inputData = swapString(inputData,first,i);

                 codeHere(inputData, first+1, last);

                 inputData = swapString(inputData, first, i);
             }
         }
    }
  public static String swapString(String str, int a, int b){
    char[] chr = str.toCharArray();
    char tempChar;
    tempChar = chr[a];
    chr[a] = chr[b];
    chr[b] = tempChar;
    return String.valueOf(chr);
  }

}