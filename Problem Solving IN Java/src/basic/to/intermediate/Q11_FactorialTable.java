package basic.to.intermediate;

import java.util.Scanner;

class FactorialTable{

	public void Factorial(int n){

		//declaring variable for initializing the Starting value of Factorial
		int SFact = 1;

		System.out.println("N  |   Factorial");
		System.out.println("----------------");

		//using for loop calculating the SFact = SFact + i and print the i value as number of iterative value and each SFact values
		for (int i = 1; i <= n; i++){
			SFact *= i;
			System.out.printf("%1d  |  %10d\n", i, SFact);
		}

	}
}

public class Q11_FactorialTable {
	
	/**
	 * This program reads a number n from the user and prints the 
	 factorial of numbers from 1 to n in a table format.
	 
	 Problem Flow:
	Read n from user
	Start fact = 1
	Loop from 1 to n
	Multiply fact *= i
	Print each number with its factorial
	
	Sample Output:
	Input:
	Enter the N value: 5

	Output:
	N   |   Factorial
	--------------------
  	1  |            1
  	2  |            2
  	3  |            6
  	4  |           24
  	5  |          120
	 */

	public static void main(String args[]){

		//get user input for N value of factorial
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the N value: ");
		int n = scanner.nextInt();

		//creating object for class FactorialTable and using the object calling the Factorial method
		FactorialTable FT = new FactorialTable();
		FT.Factorial(n);
	}
}
