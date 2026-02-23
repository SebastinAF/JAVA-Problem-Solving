package basic.to.intermediate;

import java.util.Scanner;

public class Q24_ArrayAverage {
	
	/**
	 * This program reads n numbers into an array, calculates the average 
	 of those numbers using a loop, and displays the result. 
	 It demonstrates how to use arrays and object-oriented concepts 
	 like classes and methods in Java.
	 
	Problem Flow
	Read input size n
	Read n elements into array
	Loop through array to compute sum
	Divide sum by n to get average
	Display result
	
	 Input / Output Example
Input:
Enter how many numbers: 5
Enter the numbers:
10
20
30
40
50

Output:
Average of the numbers: 30.00


	 */

	public static void main(String ags[]) {

		Scanner scanner = new Scanner(System.in);

		//getting the size of the array from user
		System.out.print("Enter how many numbers: ");
		int n = scanner.nextInt();

		//creating array to store the n values and initialization of sum
		int[] numbers = new int[n];
		int sum = 0;

		//using for loop getting input from user and calculate the sum those values to find average
		for (int i = 0; i < numbers.length; i++){
			numbers[i] = scanner.nextInt();
			sum += numbers[i];
		}

		//calculating avg using float type and print
		float avg = sum / n;
		System.out.printf("Average of the numbers: %.2f", avg);
	}
}
