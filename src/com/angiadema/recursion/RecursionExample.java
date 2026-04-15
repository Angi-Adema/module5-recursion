package com.angiadema.recursion;

import java.util.Scanner;

public class RecursionExample {
	
	// Recursive method
	public static int productNum(int[] numArray, int arrIndex) {
		
		// Base case
		if (arrIndex == numArray.length) {
			return 1;
		}
		
		// Recursive logic taking the value of the current index and multiplying
		// it by the product of all the remaining elements after this index.
		return numArray[arrIndex] * productNum(numArray, arrIndex + 1);
	}

	public static void main(String[] args) {
		// Initialize a new Scanner object for user input
		Scanner scnr = new Scanner(System.in);
		
		// Variable holding the product of input numbers
		int result;
		
		// Array to store user input of 5 numbers
		int[] numArray = new int[5];
		
		// Prompt user to enter five numbers
		System.out.println("Please enter five numbers: ");
		
		// Loop through the input numbers and store them in the array
		for (int i = 0; i < 5; i++) {
			numArray[i] = scnr.nextInt();
		}
		
		// Multiply all the numbers in the array starting at index 0
		result = productNum(numArray, 0);
		
		// Print the result of the product of all numbers entered
		System.out.println("\nThe product of the numbers entered are: " + result);

	}

}
