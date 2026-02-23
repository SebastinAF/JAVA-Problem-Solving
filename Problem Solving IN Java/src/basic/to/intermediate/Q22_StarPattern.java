package basic.to.intermediate;

import java.util.Scanner;

public class Q22_StarPattern {
	
	/**This program prints a right-aligned triangle star pattern using 
	 nested for loops. The number of lines (n) is provided by the user.
	 
	Problem Flow
	Get number of lines from user.
	Loop from 1 to n (line-by-line).
	For each line:
	Print n - i spaces.
	Print i stars.
	Go to the next line.

	Input / Output Example
	Input:
	How many Lines? 5
	Output:
    *
   **
  ***
 ****
*****

	 */


	public static void main(String ags[]) {

		Scanner scanner = new Scanner(System.in);

		//getting number of lines to be printed
		System.out.print("How many Lines? : ");
		int n = scanner.nextInt();

		//using for loop and inner for loop we are printing n-1 spaces and number of *
		for (int i = 1; i <= n; i++){
			for (int j = 0; j < n-i; j++) {
				System.out.print(" ");
				}
			for (int k = 0; k < i; k++) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}
}
