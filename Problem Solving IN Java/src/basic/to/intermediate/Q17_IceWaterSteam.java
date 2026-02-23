package basic.to.intermediate;

import java.util.Scanner;

public class Q17_IceWaterSteam {
	
	/**
	 *  This program checks the temperature value (temp) and determines 
	 the physical state of water:
		If temp < 0 → "ICE"
		If temp is between 0 and 100 (inclusive) → "WATER"
		If temp > 100 → "STEAM"
		
		Flow Summary:
		Get user input for temperature
		Use if-else to decide the state of water
		Display the result to the user
		
		Sample I/O:
		Input:
		Enter the water temperature: 120
		Output:
		Water status is STEAM Water status is 120.00

	 */

	public static void main(String ags[]) {

		Scanner scanner = new Scanner(System.in);

		//getting temperature value from user using int Data type
		System.out.print("Enter the water temperature: ");
		int temp = scanner.nextInt();

		//using if-else conditions we are checking the temperatures and printing the state of water
		if (temp <= 0){
			System.out.println("Water status is ICE Water status is " + temp);
		}else if (temp > 0 && temp < 100 ){
			System.out.println("Water status is WATER Water status is " + temp);
		} else if (temp >= 100) {
			System.out.println("Water status is STEAM Water status is " + temp);
		}
	}
}
