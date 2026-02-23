package basic.to.intermediate;

import java.util.Scanner;

class FindInterest{

	//class contains a function to calculate the Interest value by passing arguments int P, float N, int R.
	public float calculateInterest(int P, float R, int N){
		float i = R / 100;
		float F = (float) (P * Math.pow( 1 + i, N));
		return F;
	}
}

public class Q03_CompoundInterest {
	
	/**
	 * This program calculates Compound Interest using the formula:
 		F = P × (1 + i)ⁿ
 		Where:
			P = Principal amount
			i = Rate/100
			n = Number of years
 			Here, F is the final amount (principal + interest)
	
		 Problem Flow:
		Input P, R, and N from user
		Calculate i = R / 100
		Use formula F = P × (1 + i)^N
		Display the final compound amount
		
		Input / Output Example:
		Input:
		Enter Principal Value: 10000  
		Enter Rate of Interest: 10  
		Enter No. of Years: 2
		Output:
		Compound Interest 12100.00
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		//getting inputs from users for Principal Amount, Rate of Interest and No. of Years

		System.out.print("Enter Principal Value: ");
		int p = scanner.nextInt();

		System.out.print("Enter Rate of Interest: ");
		int r = scanner.nextInt();

		System.out.print("Enter No. of Years: ");
		int n = scanner.nextInt();

		//creating object to the class to FindInterest and calling the function using object
		FindInterest FI = new FindInterest();
		System.out.printf("Compound Interest %.2f", FI.calculateInterest(p, r, n));
	}

}
