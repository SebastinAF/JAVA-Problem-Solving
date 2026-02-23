package basic.to.intermediate;

import java.util.Scanner;

public class Q16_ColorAnalysis {
	
	/**
	 *  This program uses a switch statement to examine the value of a 
	 char-type variable called colour and prints one of the following
	 messages, depending on the character assigned:
		RED if either r or R is assigned to colour.
		GREEN if either g or G is assigned to colour.
		BLUE if either b or B is assigned to colour.
		BLACK if any other character is assigned to colour.
		
		Problem Flow:
		Prompt the user to enter a single character for the color code.
		Use a switch statement to check the character and assign the corresponding color.
		Print the entered color code and the corresponding color name.

		Sample Input / Output:
		Input:
		Enter Color code character: g
		Output:
		Color Code g is GREEN

	 */

	public static void main(String ags[]){

		Scanner scanner = new Scanner(System.in);

		//getting Color code value from user using char Data type
		System.out.print("Enter Color code character: ");
		char ColorCode = scanner.nextLine().toUpperCase().charAt(0);

		//using switch case we are passing the ColoCode and printing the output by case values
		switch (ColorCode){
			case 'R':
				System.out.println("Color Code r is RED");
				break;
			case 'G':
				System.out.println("Color Code g is GREEN");
				break;
			case 'B':
				System.out.println("Color Code b is BLUE");
				break;
			default:
				System.out.println("Color Code " + ColorCode + " is BLACK");
		}

	}

}
