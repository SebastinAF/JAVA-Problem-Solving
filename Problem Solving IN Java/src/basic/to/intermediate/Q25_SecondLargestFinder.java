package basic.to.intermediate;

import java.util.Scanner;

public class Q25_SecondLargestFinder {
	
	/**
	 * This program reads n integers into an array and finds the second
	 largest number among them. It uses a class with methods for input, 
	 processing (finding second largest), and output. It showcases 
	 array handling and object-oriented principles in Java.
	 
	Problem Flow 
	Read input size n
	Store values in array
	Use loop to compare and find:
		largest
		secondLargest
	Display result
	
	Input / Output Example
Input:
Enter how many numbers: 6
Enter the numbers:
10
45
22
45
8
19

Output:
Second largest number is: 22


	 */

	public static void main(String ags[]) {

		Scanner scanner = new Scanner(System.in);

		//getting the size of the array from user
		System.out.print("Enter how many numbers: ");
		int n = scanner.nextInt();

		//creating array to store the n values and initialization of largest as 0 and SecondLargest 0
		int[] numbers = new int[n];
		int largest = 0, SecondLargest = 0;

		//using for loop getting input from user and stored it to the array
		for (int i = 0; i < numbers.length; i++){
			numbers[i] = scanner.nextInt();
		}

		//using this for loop we are finding the first largest value in the array
		for (int i = 0; i < numbers.length; i++){
			if(numbers[i] > largest){
				largest = numbers[i];
			}
		}

		//using this for loop we are finding the first Second-largest value in the array by skipping the
		// first largest value (Continue)
		for (int i = 0; i < numbers.length; i++){
			if(numbers[i] == largest ){
				 continue;
			} else if (numbers[i] > SecondLargest) {
				SecondLargest = numbers[i];
			}
		}
		System.out.println("Second largest number is: " + SecondLargest);
	}
}
