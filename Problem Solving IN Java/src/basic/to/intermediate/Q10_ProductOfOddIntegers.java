package basic.to.intermediate;

public class Q10_ProductOfOddIntegers {
	
	/**
	 * This program calculates and prints the product of odd numbers from 1 to 15.
		(Odd numbers: 1, 3, 5, 7, ..., 15)
		
		Problem Flow:
		Start from 1 to 15
		Increment by 2 to get odd numbers
		Multiply all odd numbers
		Print the final product
		
		Input / Output Example:
		Output:
		Product of odd numbers from 1 to 15 = 2027025
		(Odd numbers: 1 × 3 × 5 × 7 × 9 × 11 × 13 × 15 = 2027025)

	 */

	public static void main(String ags[]){

		//declaring and initialization variable to store the Product value
		int Product = 1;

		//using for loop calculating the product = Product * i range of 1 to 15
		for (int i = 1; i <= 15; i++){
			if(i % 2 != 0) {
				Product *= i;
			}
		}

		//printing the Product value
		System.out.println("Product of odd numbers from 1 to 15 = " + Product);

	}
}
