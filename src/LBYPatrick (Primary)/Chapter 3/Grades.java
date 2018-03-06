/**
 * Grades.java ( Section 3.5)
 * Read in a sequence of grades and compute the average
 * grade, the number of passing grades (at least 60)
 * and the number of failing grades.
 * 
 * @author vpatel
 * @version 9.29.08
 * 
 */   
 
import java.util.Scanner;

public class Grades
{
	/**
	 * main method: 
	 * @param args
	 */

	    private static double grade, // a student's grade
	                       sumOfGrades; // a running total of the student grades
	    private static int numStudents,  // a count of the students
	                        numPass,     // a count of the number who pass
	    					numFail;     // a count of the number who fail

	public static boolean PositiveMessage() {
		System.out.println ("\nGrade Summary: ");
		System.out.println ("Class Average: " + sumOfGrades/numStudents);
		System.out.println ("Number of Passing Grades: " + numPass);
		System.out.println ("Number of Failing Grades: " + numFail);
		return true;
	}
	public static boolean NegativeMessage() {
		System.out.println ("No grades processed.");
		return true;
	}
	
    public static void main (String[] args)
    {
    	    Scanner scan = new Scanner(System.in);
	
	    System.out.println ("\nGrade Processing Program\n");
	
	    // Initialize summing and counting variables
	    sumOfGrades = 0;
	    numStudents = 0;
	    numPass = 0;
	    numFail = 0;
	
	    // Read in the first grade
	   System.out.print ("Enter the first student's grade: ");
	   grade = scan.nextDouble();
	
	   //
	   while (0 <= grade) {
		sumOfGrades += grade;
		numStudents ++;
		
		numFail += (grade < 60) ? 1 : 0;
		numPass += (grade >= 60) ? 1 : 0;
	
		// Read the next grade
		System.out.print ("Enter the next grade (a negative to quit): ");
		grade = scan.nextDouble();
	    }
		boolean result = numStudents > 0 ? PositiveMessage() : NegativeMessage();
	}
}
