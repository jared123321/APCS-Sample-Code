/**
 *  Grades.java (Direction)
 *  @author Lewis/Patel
 *  @version 9/27/2007	10/20/10
 *
 *  Use Student class to get test grades for two students
 *   and compute averages
 *          
 */
import java.util.Scanner;

public class Grades
{
	/**
	 * main method: 
	 * @param args
	 */
	public static void main(String[] args)
	{
		//declare instance data 
		Scanner scan = new Scanner(System.in);
		
		Student studentOne = new Student("Mary");
		//create studentTwo, "Mike"
		Student studentTwo = new Student("Mike");

		//input grades for Mary
		studentOne.inputGrades(60,100);
		//print average for Mary
		System.out.print("Mary's average grade: " + studentOne.getAverage() + "\n");

		//System.out.println();
		//input grades for Mike
		studentTwo.inputGrades(70,80);
		//print average for Mike
		System.out.print("Mike's average grade: " + studentTwo.getAverage() + "\n");

		System.out.print("\nHere is the test student info I used:\n");
		System.out.print(studentOne.toString() + "\n");
		System.out.print(studentTwo.toString());
	}
}

