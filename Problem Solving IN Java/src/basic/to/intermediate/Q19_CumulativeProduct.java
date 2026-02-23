package basic.to.intermediate;

import java.util.Scanner;

public class Q19_CumulativeProduct {
	
	/**
	 * This program reads a set of numbers from the user and calculates 
	 the cumulative product, which means multiplying all the numbers 
	 together one by one.
	 
	 Code Flow 
	Get number count n
	Use for loop to input numbers
	Multiply each number with product
	Print final result
	
	Test Data
	Input:
	6.2, 12.3, 5.0, 18.8, 7.1, 12.8
	Output:
	Cumulative Total = 514537.165312


	 */

	public static void main(String ags[]) {

		Scanner scanner = new Scanner(System.in);

		//getting the value from user using double Data type for how many double values we need to enter
		System.out.println("Enter the Number of count : ");
		double value = scanner.nextDouble();

		System.out.println("Enter the Values : ");
		//initializing the product variable as double type
		double product = 1.0;

		//using for loop product the number of inputs using the product variable
		for (int i = 1; i <= value; i++){
			double num = scanner.nextDouble();
			product *= num;
		}
		System.out.println("Cumulative Total = " + product);

		scanner.close();
	}
}
