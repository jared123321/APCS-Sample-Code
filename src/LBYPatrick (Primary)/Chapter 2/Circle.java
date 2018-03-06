/**
 *	Circle.java
 *	Print the area of a circle with two different radii
 *	@author vpatel
 *	@version 9/17/09    9/12/11
 *  	@conctact patelv@lschs.org
 */

import java.util.Scanner;

public class Circle
{
	/**
	 * main method - 
     * @param args
	 */
	
	private static final double PI = 3.14159;


	private static final int [] radiusList = {10,20};

	private static double calCircum(double radius) {return radius*2*PI;}

	private static double calArea(double radius) {return radius*radius*PI;}

	public static void main(String[] args)
	{
        // Answer for the question on the handout for variables
		// int areaOne = 10;
		// int areaTwo = 20;
		double areaChangeFactor = 0;

		Scanner getInput = new Scanner(System.in);
		

		//Phase 1

		System.out.print("\n\n========================================================\n");

		 for (int radius : radiusList) {
			System.out.println("The area of a circle with radius " 
			+ radius 
			+ " is " 
			+ calArea(radius) 
			+ " and its circumference is " 
			+ calCircum(radius));
		 }

		areaChangeFactor = calArea(radiusList[1])/calArea(radiusList[0]);
		 System.out.println("\nArea Change: " + areaChangeFactor);
		 System.out.println("Circumference Change: " + (calCircum(radiusList[1])/ calCircum(radiusList[0])));
		 
		 

		System.out.print("\n\n========================================================");
		
		//Phase 2

		int [] radius_DynamicList = {0};

		for(int i = 0; i < 2; i++) System.out.println();

		System.out.print("Please enter a value for the radius: ");
		
		radius_DynamicList[0] = getInput.nextInt();

		for (int radius : radius_DynamicList) {
			System.out.print("\n\n=====================");
			System.out.println("\nRadius: " + radius		);
			System.out.println("Circumference: " + calCircum(radius	));
			System.out.println("Area: " + calArea(radius));
			System.out.println("\nWhen Doubled:\n\tRadius: "+ (radius*2));
			System.out.println("\tCircumference: "+ calCircum(radius*2));
			System.out.println("\tArea: " + calArea(radius*2));
			System.out.println("\nArea Change: " + (calArea(radius*2)/calArea(radius)));
		 	System.out.println("Circumference Change: " + (calCircum(radius*2)/calCircum(radius)));
			System.out.print("\n=====================");
		}
	}
}
