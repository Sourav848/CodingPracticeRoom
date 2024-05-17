package com.sourav.array.problems;

public class AddTwoArrays {
    static String calc_Sum(int a[], int n, int b[], int m) {
        // Complete the function
        if (m > n) {
            int temp = n;
            n = m;
            m = temp;
            int[] tempAr = a;
            a = b;
            b = tempAr;
        }
        int carry = 0;
        String arrSum = "";
        int sum = 0;
        int i = n - 1;
        int j = m - 1;
        while (i >= 0 && j >= 0) { //for two equal array
            sum = a[i] + b[j] + carry;
            carry = 0;
            if (sum >= 10) {
                carry = sum / 10;
                arrSum = arrSum.concat(String.valueOf(sum % 10));
            } else {
                arrSum = arrSum.concat(String.valueOf(sum));
            }
            i--;
            j--;
        }
        while (i >= 0) { // if array1>array2
            if (carry != 0) {
                sum = a[i] + carry;
                carry = 0;
            } else
                sum = a[i];
            if (i == 0 && sum == 0)
                break;
            if (sum >= 10) {
                carry = sum / 10;
                arrSum = arrSum.concat(String.valueOf(sum % 10));
            } else {
                arrSum = arrSum.concat(String.valueOf(sum));
            }
            i--;
        }
        if (carry != 0)
            arrSum = arrSum.concat(String.valueOf(carry));
        String rev = "";
        for (int idx = arrSum.length() - 1; idx >= 0; idx--) {
            rev = rev + arrSum.charAt(idx);
        }
        return rev;
    }

    public static void main(String[] args) {
        int A[] = { 1, 12 };
        int B[] = { 2, 1 };
        System.out.println(calc_Sum(A, A.length, B, B.length));
    }
}
