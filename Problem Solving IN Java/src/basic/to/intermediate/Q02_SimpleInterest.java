package basic.to.intermediate;

import java.util.Scanner;

class FindSimpleInterest{

	public float calculateInterest(float P, float N, float R){
		float SI = (P * N * R ) / 100;
		return SI;
	}
}

public class Q02_SimpleInterest {
	
	/**
	 * Write a Java program to calculate Simple Interest using the formula:
 		SI = (P × N × R) / 100
 		Where:
		P = Principal amount
		N = Number of years
		R = Rate of interest
		
		Problem Flow:
		User inputs:
			Principal (P)
			Rate (R)
			Years (N)
		Program calculates:
			SI = (P × N × R) / 100
		Output displays the Simple Interest value.
		
		Input / Output Example:
		Input:
		Enter Principal Amount: 10000  
		Enter Rate of Interest: 5  
		Enter No. of Years: 2
		Output:
		Simple Interest = 1000.00
	 */

	public static void main(String args[]){

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter Principal Amount: ");
		int p = scanner.nextInt();

		System.out.print("Enter Rate of Interest: ");
		int r = scanner.nextInt();

		System.out.print("Enter No. of Years: ");
		int n = scanner.nextInt();

		FindSimpleInterest SI = new FindSimpleInterest();
		System.out.printf("Simple Interest = %.2f", SI.calculateInterest(p, r, n));

	}
}
