package basic.to.intermediate;

public class Q09_SumOfEvenIntegers {
	
	/**
	 * This program finds the sum of even numbers between 2 and 30 (inclusive).
	 	
	 Problem Flow:
	Start loop from 2 to 30
	Check if number is even (i % 2 == 0)
	Add to sum
	Print final sum
	
	 Input / Output Example:
	Output:
	Sum of even numbers from 2 to 30 = 240
	(Even numbers: 2 + 4 + 6 + ... + 30 = 240)
	 */

	public static void main(String ags[]){

		//initializing int variable sum as 0
		int sum = 0;

		//using for loop we are adding the values of even range from 2 to 30
		for (int i = 2; i <= 30; i++){
			if(i % 2 == 0) {
				sum += i;
			}
		}

		System.out.println("Sum of even numbers from 2 to 30 = " + sum);

	}
}
