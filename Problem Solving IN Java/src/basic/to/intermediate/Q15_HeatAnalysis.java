package basic.to.intermediate;

import java.util.Scanner;

public class Q15_HeatAnalysis {
	
	/**
	 *  This program uses a switch statement to examine the value of 
	 an integer called flag. Based on its value, it prints one of the
	 following messages:
		HOT if the flag has the value 1.
		LUKE WARM if the flag has the value 2.
		COLD if the flag has the value 3.
		OUT OF RANGE if the flag has any other value.
		
	 Problem Flow:
	Prompt the user to input an integer value for the flag.
	Use a switch statement to check the value of the flag and assign the correct heat status.
	Print the flag value and its corresponding heat status.
	
	Sample Input / Output:
	Input:
	Enter Heat code (1-3): 2

	Output:
	Flag 2 is LUKE WARM


	 */

	public static void main(String ags[]){

		Scanner scanner = new Scanner(System.in);

		//getting Heat code value from user rang from 1 to 3
		System.out.print("Enter Heat code (1-3):");
		int flagValue = scanner.nextInt();

		//using switch case we are passing the flag value and printing the output by case values
		switch (flagValue){
			case 1:
				System.out.println("Flag 1 is HOT");
				break;
			case 2:
				System.out.println("Flag 2 is LUKE WARM");
				break;
			case 3:
				System.out.println("Flag 3 is COLD");
				break;
			default:
				System.out.println("OUT OF RANGE");
		}

	}

}
