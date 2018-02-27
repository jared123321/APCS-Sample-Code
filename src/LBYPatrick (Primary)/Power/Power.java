/**
 *   Power.java
 *   @author Lewis/Smith
 *   @version Chapter 8 Part One
 *
 *   Reads in two integers and uses a recursive power method
 */

import java.util.Scanner;

public class Power
{
	//
    public static void main(String[] args)
    {
		Scanner scan = new Scanner(System.in);
		
		int base, exp;
		int answer;

		System.out.print("Welcome to the power program! ");
		System.out.println("Please use integers only.");

		//get base
		System.out.print("Enter the base you would like raised to a power: ");
		base = scan.nextInt();

		//get exponent
		System.out.print("Enter the power you would like it raised to: ");
		exp = scan.nextInt();

		answer = power(base,exp);
		System.out.println(base + " raised to the " + exp + " is " + answer);
    }


    /**
     *   Computes and returns base^exp
     *
     *	 @param base the base of the exponential expression
     *	 @param exp the exponent portion of the exponential expression
     *   @return base^exp
     */
     
     public static int power(int base, int exp)
     {
		 //if the exponent is 0, set pow to 1	
		 if(exp == 0) return 1;
		 else {return power(base,exp-1)*base;}
     }
}
