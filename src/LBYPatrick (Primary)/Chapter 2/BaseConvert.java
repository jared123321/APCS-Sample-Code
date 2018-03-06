/**
 *  BaseConvert.java (Direction)
 *	Converts base 10 numbers to another base (at most 4 digits in the other
 *  base).  The base 10 number and the base are input.
 *	@author vpatel
 *	@version 8/4/08  9/23/13
 *  	@contact patelv@lschs.org
 */

import java.util.Scanner;

public class BaseConvert
{
	/**
	 * main method -
     * @param args
	 */

	public static void main (String[] args)
	{
	    Scanner scan = new Scanner(System.in);
	    int base;        // the new base
	    int baseTenNum;   // the number in base 10
	    int maxNumber;   // the maximum number that will fit
					   // in 4 digits in the new base

	    int placeZero;      // digit in the 1's (base^0) place
	    int placeOne;      // digit in the base^1 place
	    int placeTwo;      // digit in the base^2 place
	    int placeThree;      // digit in the base^3 place
	   

	    String baseBNum = new String (""); // the number in the new base

	    // read in the base 10 number and the base
	    System.out.println();
	    System.out.println ("Base Conversion Program");
	    System.out.println();
	    System.out.print ("Please enter a base (2 - 9): ");
	    base = scan.nextInt();
	    
	    maxNumber = (base*base*base*base)-1;

	    // Compute the maximum base 10 number that will fit in 4 digits 
	    // in the new base and tell the user what range the number they
	    // want to convert must be in
		System.out.println("\nRange of this base format: 0~" + maxNumber);
	    System.out.print ("Please enter a base 10 number to convert: ");
	    baseTenNum = scan.nextInt();
	    
	    // Do the conversion (see notes in lab)

	    placeZero = baseTenNum % base;
	    placeOne = (baseTenNum/base) % base;
	    placeTwo = (baseTenNum/base/base) % base;
	    placeThree = (baseTenNum/base/base/base) % base;
	    
		baseBNum += placeThree;
		baseBNum += placeTwo;
		baseBNum += placeOne;
		baseBNum += placeZero;
		// Print the result (see notes in lab)
		System.out.println("Number " + baseTenNum + " in base " + base + " format: "+ baseBNum);
    }
}
       
