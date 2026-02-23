package basic.to.intermediate;

import java.util.Scanner;

public class Q21_PrimeNumbersTable {
	
	/**
	 * This program reads a number n and prints the first n prime numbers.
	 A prime number is a number that is divisible only by 1 and itself.
	 
	 Problem Flow
	Get input n (how many primes).
	Start checking from 2.
	Use isPrime() to validate.
	If prime, print it and increment count.
	Stop when count reaches n.
	 
	Input / Output Example
	Input:
	How many Prime numbers? 10
	Output:
	2 3 5 7 11 13 17 19 23 29

	 */

	public static void main(String ags[]) {

		Scanner scanner = new Scanner(System.in);

		//getting number prime value range
		System.out.print("How many Prime numbers? : ");
		int primeValue = scanner.nextInt();

		//initializing count for count number of prime values reached and number is to store prime numbers
		int count = 0;
		int number = 2;

		//using while loop we are printing the prime numbers until it reaches the count specified
		//calling isprime function with passing arguments and incrementing the count, number values.
		while (count < primeValue) {
			if (isPrime(number)) {
				System.out.print(number + " ");
				count++;
			}
			number++;
		}
		scanner.close();
	}

	//boolean function to verify the value is prime or not
	public static boolean isPrime(int n) {
		if (n <= 1) return false;

		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}
}
