package basic.to.intermediate;

import java.util.Scanner;

public class Q14_TextAnalysis {
	
	/**
	 *  This program will read a line of text from the user, analyze 
	 each character, and count how many are letters, digits, whitespace, 
	 or other types of characters (like punctuation).
	 
	 Problem Flow:
	Prompt the user to input a line of text.
	Initialize counters for letters, digits, spaces, and other characters.
	Loop through each character and classify it into one of the categories.
	Display the count for each category: letters, digits, spaces, and others.

	Sample Input / Output:
	Input:
	Enter the text below:
	Hello World! 123

	Output:
	Letters : 10
	Digits : 3
	Space Chars : 2
	Others : 2

	 */

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);

		//initializing variable for store the count of letters, digits, space_chars, others
		int Letters = 0, Digits = 0, Space_Chars = 0, others = 0;

		//getting string from user
		System.out.println("Enter the text below: ");
		String text = scanner.nextLine();

		//using for loop iterating the whole String char by char and using if condition we are checking isLetter, isDigit,
		// IsWhitespace and others with incrementing values.
		for (int i = 0; i < text.length(); i++){
			char ch = text.charAt(i);
			if (Character.isLetter(ch)){
				Letters++;
			}
			if (Character.isDigit(ch)){
				Digits++;
			}
			if(Character.isWhitespace(ch)){
				Space_Chars++;
			}
			if (!Character.isLetter(ch) && !Character.isDigit(ch) && !Character.isWhitespace(ch)){
				others++;
			}
		}
		System.out.println("Letters : " + Letters);
		System.out.println("Digits : " + Digits);
		System.out.println("Space Chars : " + Space_Chars);
		System.out.println("Others : " + others);
	}
}
