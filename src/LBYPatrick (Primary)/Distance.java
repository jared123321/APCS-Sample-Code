/**
 *  Distance.java (Directions)
 *	Code Description: Computes the distance between two points
 *	@author vpatel
 *	@version 9/15/09    9/9/10
 *   @contact patelv@lschs.org
 */

import java.util.Scanner;


public class Distance
{
	/**
	 * main Method - calculates distance based on user integer value
	 * @param args
	 */
	public static void main (String[] args)
	{
		double xOne, yOne, xTwo, yTwo; // coordinates of two points
		double distance;       // distance between the points
		Scanner scan = new Scanner(System.in);	// scanner object used to read data 
		
		// Read in the two points 
		System.out.print ("Enter the coordinates of the first point " +
				   "(put a space between them): ");
		xOne = scan.nextDouble(); 
		yOne = scan.nextDouble();

		System.out.print ("Enter the coordinates of the second point: ");
		xTwo = scan.nextDouble();
		yTwo = scan.nextDouble();

		// Compute the distance

		distance = Math.sqrt(Math.pow(xOne-xTwo,2) + Math.pow(yOne-yTwo,2));

		// Print out the answer
		System.out.println("Distance between these two points: " + distance);
	}
}
