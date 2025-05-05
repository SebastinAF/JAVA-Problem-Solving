package basic.to.intermediate;

import java.util.Scanner;

class AreaOfCircle{
	public float CalculateArea(float r){
		float area = (22.0f / 7.0f) * r * r ;
		return area;
	}
}

public class Q01_AreaOfCircle {
	
	/**
	 * Write a program to read the radius of a circle and calculate 
	 * its area using the formula:
		A = π * r²
	
	Problem Flow:
	1. User inputs radius (r)
	2. Program calculates: area = (22.0 / 7) * r * r
	3. Output displays area with radius
	
	Input / Output Example:
	Input:
	Enter Radius of Circle: 7
	Output:
	Area of Circle with Radius 7.0000 is 154.0000
	 */
	
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Radius of Circle: ");
		float r = scanner.nextFloat();

		AreaOfCircle AF = new AreaOfCircle();
		System.out.printf("Area of Circle with Radius %.4f is %.4f" ,r, AF.CalculateArea(r));
	}

}
