package com.oop.practice;
//#22
public class TwoDimentionalArray {

	public static void main(String[] args) {
		int arr [][] = {
			{10, 20, 30},
			{5, 10, 15, 20, 25},
			{2, 4, 6, 8, 10, 12},
			{99, 999}
		};
		
		//Display of array elements
		
		for(int i=0; i<arr.length; i++) {
			System.out.println("Row " + i + " length: " + arr[i].length);
			System.out.print("Row " + i + " Elements: ");
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		
		//Find min value of the above matrix
		
		int m = arr[0][0];
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				m = Math.min(m, arr[i][j]);
			}
		}
		System.out.println("The smallest value of the matrix is " + m);

	}

}
