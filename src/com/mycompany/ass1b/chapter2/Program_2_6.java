/** Ex. 2.6: Product.java
 *  This program will calculate the product of 3 integers
 */
package com.mycompany.ass1b.chapter2;
import java.util.Scanner;

/**
 * @author jkris
 *
 */
public class Program_2_6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int x, y, z, result;
		
		System.out.print("Enter the first integer: ");
		x = input.nextInt();
		
		System.out.print("Enter the second integer: ");
		y = input.nextInt();
		
		System.out.print("Enter the third integer: ");
		z = input.nextInt();
		
		result = x * y * z;
		System.out.printf("Product is %d%n", result);
	}
}
