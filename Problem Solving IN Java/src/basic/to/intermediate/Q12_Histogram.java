package basic.to.intermediate;

import java.util.Scanner;

public class Q12_Histogram {
	
	/**
	 * This program reads 5 numbers (each between 1 and 30) from the user.
	 For each number, it prints a line with that many asterisks *, 
	 forming a simple bar chart or histogram.
	 
	 Problem Flow:
	Read 5 numbers from the user
	Loop through each number
	For each number:
	Print the number
	Print that many * using inner loop
	
	Sample Output:
	Input:
	Enter 5 Numbers in a same line: 
	3 7 2 6 1
	Output:
	3 ***
 	7 *******
 	2 **
 	6 ******
 	1 *
	 */

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);

		//creating array integer number size of 5
		int[] number = new int[5];

		//getting input from users 5 Numbers in a same line using for loop to store the number of values in same array
		System.out.println("Enter 5 Numbers in a same line: ");
		for (int i = 0; i < number.length; i++){
			number[i] = scanner.nextInt();
		}

		//getting value from stored array and printing using the for loop
		//1st for loop is for getting the value and second is for print number of stars by the value we fetch
		//from loop one.
		for (int j = 0; j < number.length; j++){
			System.out.print(number[j] + " ");
			for (int k = 0; k < number[j]; k++){
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}
