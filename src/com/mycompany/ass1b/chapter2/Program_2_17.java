/** Ex. 2.17: Arithmetic, Smallest and Largest
 *  This program takes 3 int and returns the
 *  sum, average, smallest and largest
 */
package com.mycompany.ass1b.chapter2;

import java.util.Scanner;

/**
 * @author jkris
 *
 */
public class Program_2_17 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int x, y, z, result, small, large;
		
		System.out.print("Enter the first integer: ");
		x = input.nextInt();
		
		System.out.print("Enter the second integer: ");
		y = input.nextInt();
		
		System.out.print("Enter the third integer: ");
		z = input.nextInt();
		
		result = x + y + z;
		System.out.printf("\nSum is %d%n", result);
		
		result /= 3;
		System.out.printf("\nAverage is %d%n", result);
		
		if(x != y || x != z || y != z)
		{
			small = x;
			if(small > y) 
			{
				small = y;
				if (small > z) {small = z;}
			}
			
			if(small > z) {small = z;}
			
			System.out.printf("\n%d is the smallest number", small);
		
			large = x;
			if(large < y)
			{
				large = y;
				if (large < z) {large = z;}
			}
			
			if(large < z) {large = z;}
			
			System.out.printf("\n\n%d is the largest number", large);
		}
		
		else {System.out.printf("\nThe numbers are all equal.\nThe smallest and largest is %d%n", x);

		}
	}
}
