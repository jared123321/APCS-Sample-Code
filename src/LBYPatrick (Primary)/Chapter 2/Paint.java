/**
 *	Paint.java (Direction)
 *	Determine how much paint is needed to paint the walls 
 *	of a room given its length, width, and height
 *
 *	@author vpatel
 *	@version 8/9/08    9/8/13
 *  	@contact patelv@lschs.org
 */
import java.util.Scanner;
public class Paint
{
	/**
	 * main method - 
    * @param args
	 */
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);//declare a scanner class object
        final int COVERAGE = 350;  //paint covers 350 sq ft/gal
        int length, width, height; //declare integers length, width, and height;
        double totalSqFt;//declare double totalSqFt;
        double paintNeeded;//declare double paintNeeded;

        System.out.print("Please enter the length of the room:"); length = obj.nextInt();//Prompt for and read in the length of the room
        System.out.print("\nPlease enter the width of the room:"); width = obj.nextInt();//Prompt for and read in the width of the room

         System.out.print("\nPlease enter the height of the room:"); height = obj.nextInt();//Prompt for and read in the height of the room

        totalSqFt = (length*width) + (width*height*2) + (length*height*2); //Compute the total square feet to be painted--think
        
         System.out.println("\n\nDimensions:\n\tCeiling: " 
                            + (length*width)
                            + " sqft\n\tWall Type #1: " 
                            + (width*height)
                            + " sqft\n\tWall Type #2: "
                            + (length*height) + " sqft"
                            );//about the dimensions of each wall

        paintNeeded = (totalSqFt/COVERAGE); //Compute the amount of paint needed

        System.out.println("\nI paint every wall EXCEPT the floor.\n\n\tHeight: "
                            + height 
                            + "\n\tWidth: " 
                            + width
                            + "\n\tLength: " 
                            + length 
                            + "\n\nPaint needed:" + paintNeeded + " gallons");//Print the length, width, and height of the room and the
                                                                 //number of gallons of paint needed.

    }
}
