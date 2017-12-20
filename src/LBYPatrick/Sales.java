/**
 * Sales.java (Direction)
 *
 * @author Lewis
 * @version Part One
 *
 * Reads in and stores sales for each of 5 salespeople.  Displays
 * sales entered by salesperson id and total sales for all salespeople.
 */
 
import java.util.Scanner;

final public class Sales
{
	/**
	 * Main method:
	 * @param args
	 */
	public static void main(String[ ] args)
	{
		Scanner scan = new Scanner(System.in);
		
		int SALESPEOPLE;
		int[ ] sales;
		int sum;
	
		System.out.printf("Please enter the number of salesperson:");
		SALESPEOPLE = Integer.parseInt(scan.next());
		sales = new int[SALESPEOPLE];

		//loops used to prompt user for sales
		for (int i=0; i<sales.length; i++)
		{
			System.out.print("Enter sales for salesperson " + (i+1) + ": ");
			sales[i] = scan.nextInt();
		}

		System.out.println("\nSalesperson   Sales");
		System.out.println("--------------------");
		sum = 0;
		
		//Loop for finding total sales 
		for (int i=0; i<sales.length; i++)
		{
			System.out.println("     " + (i+1) + "         " + sales[i]);
			sum += sales[i];	
		}

		System.out.println("\nTotal sales: " + sum);
	}
}




