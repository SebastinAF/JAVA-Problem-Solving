package basic.to.intermediate;

import java.util.Scanner;

public class Q23_NumberPyramid {
	
	/**This program prints a numeric pyramid pattern where numbers 
	 increase from the middle outwards and then decrease symmetrically. 
	 The pattern is centered and uses nested loops
	 
	 Problem Flow Summary
	Ask user for number of lines (n).
	For each line i from 1 to n:
	Print spaces to align the pyramid.
	Print increasing numbers (i to i + i - 1).
	Print decreasing numbers back to i.
	Move to the next line after printing each row.
	
Input / Output Example
Input:
Enter Number of Lines: 5

Output:
    1
   232
  34543
 4567654
567898765


	 
	 */


	public static void main(String ags[]) {

		Scanner scanner = new Scanner(System.in);

		//getting number of lines to be printed
		System.out.print("Enter Number of Lines: ");
		int n = scanner.nextInt();

		//using for loop printing the n number of rows
		for (int i = 1; i <= n; i++){
			// Print spaces to center the pyramid
			for (int s = 1; s <= n - i; s++) {
				System.out.print(" ");
			}

			// Print increasing numbers starting from i
			int num = i;
			for (int j = 1; j <= i; j++) {
				System.out.print(num++);
			}

			// Print decreasing numbers starting from num - 2
			num = num - 2;
			for (int j = 1; j < i; j++) {
				System.out.print(num--);
			}
			System.out.println();
		}

	}
}
