package com.sourav.matrix.problems;

//company : oracle
public class MatrixMultiplication {
	
	public static void main(String args[]) {
//creating two matrices    
		int a[][] = { { 1, 1, 1 }, 
				      { 2, 2, 2 }, 
				      { 3, 3, 3 } };
		
		int b[][] = { { 1, 1, 1 }, 
				      { 2, 2, 2 }, 
				      { 3, 3, 3 } };
		
//condition of matrix to perform
		//no of column of a[row][column] equals to no of row in b[row][column]

//creating another matrix to store the multiplication of two matrices    
		int c[][] = new int[3][3]; // c[i]= take no of rows from first matrix(3)
	                               // c[j]= take no of column from second matrix(3) 	

//multiplying and printing multiplication of 2 matrices    
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				c[i][j] = 0;
				for (int k = 0; k < 3; k++) {
					c[i][j] += a[i][k] * b[k][j];
				} 
				System.out.print(c[i][j] + " "); // printing matrix element
			} // end of j loop
			System.out.println();// new line
		}
	}
}
