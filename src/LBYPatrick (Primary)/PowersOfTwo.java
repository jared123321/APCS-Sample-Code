/**
 *		PowersOfTwo.java (direction)
 *		Print out as many powers of 2 as the user requests
 *		@author Lewis/Patel
 *		@version 9.20.08    10/4/10    
 */

import java.util.Scanner;

public class PowersOfTwo
{
    /**
     * main method
     * @param args
     */
    public static void main(String[] args)
    {
        final int baseNumber = 2;
        int numPowersOfTwo;        //How many powers of 2 to compute
        int nextPowerOfTwo = 1;    //Current power of  2
        int exponent = - 1;            //Exponent for current power of 2 -- this
                        	 //also serves as a counter for the loop
        Scanner scan = new Scanner(System.in);

	System.out.println("How many powers of " + baseNumber +  " would you like printed?");
        numPowersOfTwo = scan.nextInt();
                
        //print a message saying how many powers of 2 will be printed
        System.out.printf("Here are the first "+ numPowersOfTwo + " powers of " + baseNumber +":\n");

	while ( exponent < numPowersOfTwo )
	{
		    exponent ++;
            //print out current power of 2
                System.out.printf(baseNumber +"^" + exponent + " = " + (int)Math.pow(baseNumber,exponent) + "\n");
	            //find next power of 2 -- how do you get this from the last one?
                nextPowerOfTwo = (int)Math.pow(baseNumber,exponent+1);
	}
    }
}

   
