/** Ex. 2.15: Arithmetic
 *  This program takes 2 ints and returns their
 *  sum, difference, product and quotient
 */
package com.mycompany.ass1b.chapter2;
import java.util.Scanner;

/**
 * @author jkris
 *
 */
public class Program_2_15 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int x, y, result;
		
		System.out.print("Enter the first integer: ");
		x = input.nextInt();
		
		System.out.print("Enter the second integer: ");
		y = input.nextInt();
		
		result = x + y;
		System.out.printf("\nSum is %d%n", result);

		result = x - y;
		System.out.printf("\nDifference is %d%n", result);
		
		result = x * y;
		System.out.printf("\nProduct is %d%n", result);

		result = x / y;
		int rem = x % y;
		System.out.printf("\nProduct is %d with a remainder of %d%n", result, rem);
	}

}
