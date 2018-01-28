/**
 *    LabGrade.java (Direction)
 *
 *    This program computes a student's lab grade from
 *    the grades on the three components of lab:  the pre-lab
 *    assignment, the lab itself, and the post-lab assignment.
 *    Code Description: 
 *    @author vpatel
 *    @version 9/18/09  9/8/11
 *    @contact patelv@lschs.org
 */

import java.util.Scanner;

public class LabGrade
{
	/**
	 *  main method - Read in grades for pre-lab, lab, and post-lab
     *                and compute a weighted average for the lab grade.
     *  @param args
     */

	private static void printf(String text, boolean toNewLine){
        if (toNewLine) System.out.print("\n");
		System.out.print(text);
    }

	public static void main (String[] args)
	{
		
		Scanner scan = new Scanner(System.in); //Declare a Scanner object
		
		// Declare constants
		double inWeight = 0.6;  // in-class weight is 60%
		double outWeight = 0.4; // out-of-class weight is 40%
		double assignmentWeight = 0; // Assignment weight (out-of-class work) (Just Initialized, I haven't give any value yet)

		// Declare variables
		double preLabPts, preLabMax;    //number of points earned & max points on the pre-lab assignment
		double labPts, labMax;       //number of points earned & max points on the lab
		double postLabPts, postLabMax;   //number of points earned & max points on the post-lab assignment
		
		
		double outClassAvg = 0;  //average on the out of class (pre and post) work
		double inClassAvg = 0;   //average on the in-class work
		double labGrade = 0;  //final lab grade

		// Get the input	
		System.out.println("\nWelcome to the Lab Grade Calculator\n");
		System.out.print("Enter the number of points you earned on the pre-lab: "); preLabPts = scan.nextInt(); //read pre-lab points
		System.out.print("What was the maximum number of points you could have earned? ");preLabMax = scan.nextInt(); //read preLabMax points
		System.out.print("Enter the number of points you earned on the lab: ");labPts = scan.nextInt();//read labPts points
		System.out.print("What was the maximum number of points for the lab? ");labMax = scan.nextInt();//read labMax points
		System.out.print("Enter the number of points you earned on the post-lab: ");postLabPts = scan.nextInt();//read postLabPts points
		System.out.print("What was the maximum number of points for the post-lab? ");postLabMax = scan.nextInt();//read postLabMax points


		//Extra Part on asking weight
		printf("What is the weight for in-class work?\nPlease make it in decimal form\n\tInput: ",true); double weightTemp = scan.nextDouble();
		if (weightTemp > 1 || weightTemp <= 0) {
			printf("\tInvaild weight, the calculation for lab grade might not be accurate.",true);
		}

		inWeight = weightTemp;

		printf("What is the weight for out-class work?\nPlease make it in decimal form\n\tInput: ",true); weightTemp = scan.nextDouble();
		if (weightTemp > 1 || weightTemp <= 0) {
			printf("\tInvaild weight, the calculation for lab grade might not be accurate.",true);
		}
		
		outWeight = weightTemp;




		System.out.println();

		// Calculate the average for the out of class work
		outClassAvg = ((preLabPts + postLabPts) / (preLabMax + postLabMax)) * 100;
		//printf("OUTCLASS: " + (double)(outClassAvg),true); // For debugging
		
		// Calculate the average for the in-class work
		inClassAvg = (labPts / labMax) * 100;
		//printf("INCLASS: " + inClassAvg,true); // For debugging


		// Calculate the weighted average taking 40% of the out-of-class average
		// plus 60% of the in-class 
		labGrade = (outWeight * outClassAvg) + (inWeight * inClassAvg);
		assignmentWeight = 1 - inWeight;
		//printf("LABGRADE: "+ labGrade, true); // For debugging
		// Print the results
		printf("Assignment weight is: " + assignmentWeight, true);
		printf("Your average on out-of-class work is " + outClassAvg + "%",true); 
		printf("Your average on in-class work is " + inClassAvg + "%",true);
		printf("Your lab grade is " + labGrade + "%",true);
		System.out.println();

	}
}

