/**
* Dates.java (Direction) 
* @author Lewis/Patel
* @version 9/27/10
* Determine whether a 2nd-millenium date entered by the user
* is valid
*          
*/
import java.util.Scanner;

public class Dates
{
	/**
	 * Main Method:
	 * @param args
	 */

    private static Scanner scan = new Scanner(System.in);

	final private static boolean detectLeapYear(int year){
		if((year%4 == 0 && year%100 != 0) || year%400 == 0) return true;
		else return false;
	}

	final private static int CALdaysInMonth(int month,boolean isLeapYear){
		if (month%2 == 0) {
			if(month == 2) {
				if(!isLeapYear) return 28;
				else return 29;
			}
			else return 30;
		}
		else return 31;
	}

	final private static class tempSpace{
		int val;
		int resultState;
	}

	private static void promptForInfo(String message, tempSpace objectName){
		System.out.print(message);
		objectName.val = scan.nextInt();
	}



    public static void main(String[] args)
    {
		final tempSpace obj = new tempSpace();
		int month, day, year;   //date read in from user
		int daysInMonth;        //number of days in month 
		boolean monthValid, yearValid, dayValid;  //true if input from user is valid
		boolean leapYear;  //true if user's year is a leap year
		//Get integer month, day, and year from user
		promptForInfo("Month:", obj);
		month = obj.val;
		promptForInfo("Day:", obj);
		day = obj.val;
		promptForInfo("Year:", obj);
		year = obj.val;
		//Check to see if month is valid
		monthValid = (month <= 12 && month >= 1);

		//Check to see if year is valid
		yearValid = (year >= 1000 && year <= 2050);

		//Determine whether it's a leap year
		leapYear = detectLeapYear(year);

		//Determine number of days in month
		daysInMonth = CALdaysInMonth(month,leapYear);
		if (!monthValid) daysInMonth = 0; //Overwrite result if month is invalid
		
		//User number of days in month to check to see if day is valid
		dayValid = (day <= daysInMonth);

		//Determine whether date is valid and print appropriate message
		if(monthValid && dayValid && yearValid) System.out.printf("Date is vaild.\n" + "Leap Year: " + (leapYear? "Yes" : "No"));
		else System.out.printf("Date is not Vaild.\n");
	}

}


