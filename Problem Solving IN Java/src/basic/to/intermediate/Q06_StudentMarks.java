package basic.to.intermediate;

import java.util.Scanner;

public class Q06_StudentMarks {
	
	/**
	 * This program allows the user to enter 3 test marks of a student, 
	 calculates the total and average, and displays the result.
	 
	Problem Flow:
	Get 3 marks from user
	Add marks → total
	Divide total by 3.0 → average
	Display total and average
	
	Input / Output Example:
	Input:
	Enter Mark 1: 80  
	Enter Mark 2: 75  
	Enter Mark 3: 85  
	Output:
	Total Marks   = 240  
	Average Marks = 80.0
	 */

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		//getting 3 marks from user for sum and find Average
		System.out.print("Enter Mark 1: ");
		int m1 = scanner.nextInt();
		System.out.print("Enter Mark 2: ");
		int m2 = scanner.nextInt();
		System.out.print("Enter Mark 3: ");
		int m3 = scanner.nextInt();

		//sum the marks for total
		int total = m1 + m2 + m3;

		//using float type finding the Average = total / 3.0f
		float average = total / 3.0f;

		System.out.print("Total Marks   = " + total + "\n");
		System.out.print("Average Marks = " + average);
	}
}
