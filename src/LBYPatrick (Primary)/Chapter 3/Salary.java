/**
*   Salary.java (Direction)
*   Computes the amount of a raise and the new
*   salary for an employee.  The current salary
*   and a performance rating (a String: "Excellent",
*   "Good" or "Poor") are input.
*   @ author Lewis / Patel
*   @version 1.1  9/19/10
*/ 
import java.util.Scanner;
import java.text.NumberFormat;

public class Salary
{
    /**
     *	Main Method:
     * @param args
     */

	final private static boolean CompareSTR(String contentOne, String contentTwo, boolean strict){
		if(strict) return contentOne.equals(contentTwo);
		else return contentOne.toUpperCase().equals(contentTwo.toUpperCase());
	}

   final public static void main (String[] args)
   {
	final Scanner scan = new Scanner(System.in);
	//Define your constant variables
		
	double currentSalary=0;   // employee's current  salary
	double raise=0;           // amount of the raise
	double newSalary=0;       // new salary for the employee
	String rating= new String();         // performance rating

	System.out.print ("Enter the current salary: ");
	currentSalary = scan.nextDouble();
	System.out.print ("Enter the performance rating (Excellent, Good, or Poor): ");
	rating = scan.next();

	// Compute the raise using if ...

	if(CompareSTR(rating,"Excellent",false)) raise = currentSalary * 0.06;
	else if(CompareSTR(rating,"Good",false)) raise = currentSalary * 0.04;
	else if(CompareSTR(rating,"Poor",false)) raise = 0;

	newSalary = currentSalary + raise;

	// Print the results
	final NumberFormat money = NumberFormat.getCurrencyInstance();
	System.out.println();
	System.out.println("Current Salary:       " + money.format(currentSalary));
	System.out.println("Amount of your raise: " + money.format(raise));
	System.out.println("Your new salary:      " + money.format(newSalary));
	System.out.println();
    }
 }
