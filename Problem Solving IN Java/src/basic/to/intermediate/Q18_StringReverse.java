package basic.to.intermediate;

import java.util.Scanner;

public class Q18_StringReverse {
	
	/**
	 *  This program takes a string (text) and creates its reverse 
	 version in another string (reverseText). Each character from the 
	 original string is added in reverse order to the new string.
	 
	 Flow Summary
	Read the input string
	Loop from last character to first
	Use comma operator in loop (i--, j++)
	Add each character to reverseText
	Print the reversed output
	
	Sample I/O
	Input:
	Enter the string below:
	hello
	Output:
	Reversed Text: olleh

	 */

	public static void main(String ags[]) {

		Scanner scanner = new Scanner(System.in);

		//getting the String from user using String Data type
		System.out.println("Enter the string below : ");
		String string = scanner.nextLine();

		// taking the string variable, reverses its characters using StringBuilder, and print .
		System.out.println("Reversed Text: " + new StringBuilder(string).reverse());

	}
}
