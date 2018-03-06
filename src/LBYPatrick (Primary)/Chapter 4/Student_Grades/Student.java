/**
 *   Student.java
 *   @author Lewis/Patel
 *   @version 10/25/11  11/2/11
 *
 *   Define a student class that stores name, score on test 1, and
 *   score on test 2.  Methods for updating grades, 
 *   compute the average, and print student's name.
 */

import java.util.Scanner;

public class Student
{
	//declare instance data
	private double [] grades = {0,0};
	private String sName = "";
	private Scanner scan = new Scanner(System.in);
    /**
     *  default constructor
     */
    public Student() {}
    
	/**
	 * constructor
	 * @param studentName the name of the student
	 */
 	public Student(String studentName) {
		//add body of constructor
		this.sName = studentName;
	}

	/**
	 * Will be given two test score valuesstudent's grades for test 1 and test 2.
	 * @param tOne first test score out of 100
	 * @param tTwo second test score out of 100
	 */
 	final public void inputGrades(double tOne, double tTwo) {
		
		while (grades[0] > 100 || grades[0] < 0) { 
			System.out.printf("\nWARNING: Grade for the first test is invaild, please enter another one: ");
			this.grades[0] = scan.nextDouble();
		} 
		
		
		while (grades[1] > 100 || grades[1] < 0) {
			System.out.printf("WARNING: Grade for the second test is invaild, result might be wrong.\n"); 
			this.grades[1] = scan.nextDouble();
		} 

		this.grades[0] = tOne;
		this.grades[1] = tTwo; 
	}

	/**
	 *  Function name: getAverage 
	 *  compute and return the student's test average
	 *  @return 
	 */
	
	final public double getAverage() {return (this.grades[0] + this.grades[1]) / 2;}
	
	 
	/**
	 * Function name: printName 
	 * print the student's name
	 */

	final public void printName() {System.out.print(this.sName);}
  	
	//add accessor functions (get Methods) for instance data
	
	final public String getName() {return this.sName;}

    //add function heading a dumby definition for equals method
	final public boolean equals(Student obj) {return (obj.sName == this.sName) && (obj.getAverage() == this.getAverage());}
	//add toString method()
	final public String toString() {
		return "Name: " + this.sName + "\tTest1: " + this.grades[0] + "\tTest2: " + this.grades[1];
	}
}












