/**
Author:George Samu
Date:5/27/2020
Purpose: Chapter 3 number 3

*/

import java.util.Scanner;

public class ReadInteger
{
	public static void main (String[]args)
	{
	
	
	Scanner keyboard=new Scanner(System.in);
	System.out.println("Please enter an integer between " +
						" 1000 and 999999: ");
	int number =keyboard.nextInt();
	int thousands= number / 1000; // uses integer division, so no decimal
	int ones = number % 1000;     // Returns the remainder between 0-999
	
	System.out.println("The formatted value is " + thousands + "," + ones + ".");
	
	
	}//end main
}//end ReadInteger