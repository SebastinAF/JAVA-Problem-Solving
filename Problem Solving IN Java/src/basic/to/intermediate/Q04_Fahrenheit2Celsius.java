package basic.to.intermediate;

import java.util.Scanner;

class Fahrenheit2Celsius{

	//function to calculate ConvertToCelsius using C = (5 / 9.0) × (F - 32)
	public float ConvertToCelsius(float F){

		float C = (5 / 9.0f) * (F - 32);
		return C;
	}
}

public class Q04_Fahrenheit2Celsius {
	
	/**
	 * This program converts temperature from Fahrenheit to Celsius using the formula:
		C = (5/9) × (F - 32)
		
	Problem Flow:
	Input temperature in Fahrenheit
	Apply formula: C = (5 / 9.0) × (F - 32)
	Display result in Celsius
	
	Input / Output Example:
	Sample Inputs to Test (from question):
	68, 150, 212, 0, -22
	Sample Output (for 68°F):
	68.000000 deg F is 20.000000 deg C
	
	 */

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		//getting input from user for Fahrenheit using float type
		System.out.println("Enter Fahrenheit: ");
		float f = scanner.nextFloat();

		//creating object for Fahrenheit2Celsius and using object we are calling the function
		Fahrenheit2Celsius FTC = new Fahrenheit2Celsius();
		System.out.printf("For %.6f deg F is %.6f deg C", f, FTC.ConvertToCelsius(f));
	}

}
