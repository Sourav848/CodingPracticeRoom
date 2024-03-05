package com.sourav.array.problems;

//companies : Sapiens
public class SecondMax {

	// JAVA Code for Find Second largest
	// element in an array

	/*
	 * Function to print the second largest elements
	 */
	public static void print2largest(int arr[], int arr_size) {
		int i, first, second;

		/* There should be atleast two elements */
		if (arr_size < 2) {
			System.out.print(" Invalid Input ");
			return;
		}

		first = second = Integer.MIN_VALUE;
		for (i = 0; i < arr_size; i++) {
			/*
			 * If current element is smaller than first then update both first and second
			 * and this if condition storing max
			 */
			if (arr[i] > first) {
				second = first;
				first = arr[i];
			}

			/*
			 * If arr[i] is in between first and second then update second second condition
			 * is checking if array have two max same number to avoid to store in max in
			 * second
			 */
			else if (arr[i] > second && arr[i] < first)
				second = arr[i];
		}

		if (second == Integer.MIN_VALUE)
			System.out.print("There is no second largest" + " element\n");
		else
			System.out.println("The second largest element" + " is " + second);
	}
	
	
	static void thirdLargest(int arr[], int arr_size) {
		/*
		 * There should be atleast three elements
		 */
		if (arr_size < 3) {
			System.out.printf(" Invalid Input ");
			return;
		}

// Find first
// largest element
		int first = arr[0];
		for (int i = 1; i < arr_size; i++)
			if (arr[i] > first)
				first = arr[i];

// Find second
// largest element
		int second = Integer.MIN_VALUE;
		for (int i = 0; i < arr_size; i++)
			if (arr[i] > second && arr[i] < first)
				second = arr[i];

// Find third
// largest element
		int third = Integer.MIN_VALUE;
		for (int i = 0; i < arr_size; i++)
			if (arr[i] > third && arr[i] < second)
				third = arr[i];

		System.out.println("The third Largest element is "+third);
	}

	/* Driver program to test above function */
	public static void main(String[] args) {
		int arr[] = { 12, 12, 35, 1, 10, 34, 1 };
		int n = arr.length;
		print2largest(arr, n);
		thirdLargest(arr, n);
	}

	
	/*static int thirdLargest1(int a[], int n) {
		int max1 = -1, max2 = -1, max3 = -1;
		for (int i = 0; i < n; i++) {
			if (a[i] > max1) {
				max3 = max2;
				max2 = max1;

				max1 = a[i];
			} else if (a[i] > max2) {
				max3 = max2;

				max2 = a[i];
			} else if (a[i] > max3) {
				max3 = a[i];
			}
		}

		return max3;
	}*/
	 
}
