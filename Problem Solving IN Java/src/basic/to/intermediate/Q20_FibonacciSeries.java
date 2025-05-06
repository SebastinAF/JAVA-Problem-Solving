package basic.to.intermediate;

import java.util.Scanner;

public class Q20_FibonacciSeries {
	/**
	 * This program calculates and displays the first n numbers in the 
	 Fibonacci sequence. Each number is the sum of the previous 
	 two numbers.
	 
	 Code Flow 
	Input: number of terms n
	Initialize first two terms: f1 = 1, f2 = 1
	Loop from i = 3 to n:
		Find next term using f = f1 + f2
		Shift values for next round
	Display all terms
	
	Sample Input/Output
 	Input:
	How many Fibonacci terms? 10
	Output:
	1 1 2 3 5 8 13 21 34 55

	 */

	public static void main(String ags[]) {

		Scanner scanner = new Scanner(System.in);

		//getting number of terms from user using ind type
		System.out.print("How many Fibonacci terms? : ");
		int terms = scanner.nextInt();

		//creating array to store the calculated value of Fibonacci
		int[] numberOfTerms = new int[terms];
		numberOfTerms[0] = 1;
		numberOfTerms[1] = 1;

		//using for loop add the values in previous indexed stored in array and store calculated value in next array index
		for (int i = 2; i < terms; i++){
			numberOfTerms[i] = numberOfTerms[i-1] + numberOfTerms[i-2];
		}

		//printing the values using foreach loop
		for (int a : numberOfTerms){
			System.out.print(a + " ");
		}
	}
}
