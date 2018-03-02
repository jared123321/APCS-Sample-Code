/**
 *   DigitPlay.java
 *   @author Lewis/Patel/Smith
 *   @version Chapter 8 Part Two
 * 
 *   Finds the number of digits in a positive integer.
 */

import java.util.Scanner;

public class DigitPlay
{
	//
    public static void main (String[] args)
    {

		int num;    //a number
		Scanner scan = new Scanner(System.in);

		System.out.println ();
		System.out.print ("Please enter a positive integer: ");
		num = scan.nextInt ();
		//
		if (0 >= num )
		{
			System.out.println ( num + " isn't positive -- start over!!");
		}
		
		else 
		{
			// Call numDigits to find the number of digits in the number
			
			// Print the number returned from numDigits
			
			System.out.println ("\nThe number " + num + " contains " +
							+ numDigits(num) + " digits.");
			System.out.println ("And this number " + (numDigits(num)%7 == 0? "is " : "is not ") + "divisible by 7");
		}
    }

    /**
     *  Recursively counts the digits in a positive integer 
     *
	 *	@param num a number with an unknown amount of digits
	 *   @return the number of digits in num
	 */
    
	public static long numDigits(long num)
	{
		String tempBuffer = Long.toString(num);
		if(tempBuffer.contains("-")) {return tempBuffer.length()-1;} 
		else return tempBuffer.length();
	}
}