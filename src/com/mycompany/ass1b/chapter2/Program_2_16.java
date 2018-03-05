/** Ex. 2.16: Comparing Integers
 * This program compares two user given integers
 */
package com.mycompany.ass1b.chapter2;
import java.util.Scanner;

/**
 * @author jkris
 *
 */
public class Program_2_16 
{
	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int x, y;
		
		System.out.print("Enter the first integer: ");
		x = input.nextInt();
		
		System.out.print("Enter the second integer: ");
		y = input.nextInt();
		
		if(x == y) {System.out.println("\nThese numbers are equal.");}
		
		else if(x > y) {System.out.printf("%d is larger", x);}
		
		else {System.out.printf("%d is larger", y);}
	}	
}
