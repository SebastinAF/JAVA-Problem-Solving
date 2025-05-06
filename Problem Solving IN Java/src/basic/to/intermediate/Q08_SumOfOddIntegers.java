package basic.to.intermediate;

import java.util.Scanner;

class SumOfOddIntegers{

	public int SumOfOdd(int n){
		int sum = 0, count = 0;

		for (int i = 1; count < n; i++){
			if(i % 2 != 0) {
				sum += i;
				count++;
			}
		}

		return sum;
	}
}


public class Q08_SumOfOddIntegers {
	
	/**
	 * This program calculates the sum of the first n odd integers
	 (Example: 1 + 3 + 5 + ... + (2n - 1)).

	 Problem Flow:
	Input n from user
	Loop from 1 to (2n−1) in steps of 2
	Accumulate the sum
	Print the result
	
	Input / Output Example:
	Input:
	Enter how many odd numbers to sum: 5
	Output:
	Sum of first 5 odd numbers is 25
	(1 + 3 + 5 + 7 + 9 = 25)

	 */

	public static void main(String ags[]){

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter how many odd numbers to sum: ");
		int n = scanner.nextInt();

		SumOfOddIntegers SOI = new SumOfOddIntegers();
		System.out.println("Sum of first 5 odd numbers is " + SOI.SumOfOdd(n));

	}

}
