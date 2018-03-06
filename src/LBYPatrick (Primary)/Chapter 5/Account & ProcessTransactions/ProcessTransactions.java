/**
 * ProcessTransactions.java
 * @author ppatel
 * @version 1/4/10
 * A class to process deposits and withdrawals for two bank
 * accounts for a single day.
 */
import java.util.Scanner;

public class ProcessTransactions
{
    /**
     * driver code to test account class.
     * @param args
     */
    public static void main(String[] args)
    {
	Scanner scan = new Scanner(System.in);
	Account acctOne, acctTwo;      //two test accounts
	char keepGoing = 'y';         //more transactions?
	char action;                  //deposit or withdraw
	double amount;                //how much to deposit or withdraw
	long acctNumber;              //which account to access

	//Create two accounts
	acctOne = new Account(1000.00, "Sue", 123);
	acctTwo = new Account(1000.00, "Joe", 456);

	System.out.println("The following accounts are available:\n");
	acctOne.printSummary();

	System.out.println();
	acctTwo.printSummary();

	//while loop to run code
	while ('y'== keepGoing || 'Y'== keepGoing  )
	{
		//get account number, what to do, and amount
		System.out.print("\nEnter the number of the account you would like to access: ");
		acctNumber = scan.nextLong();
		System.out.print("Would you like to make a deposit (D) or withdrawal (W)? ");
		action = scan.next().charAt(0);
		System.out.print("Enter the amount: ");
		amount = scan.nextDouble();
		
		// add braces to the conditionals to improve readability.
		//check user values and allow access to account
		if (0 < amount)
		    if ( acctOne.getAcctNumber() == acctNumber )
			if ('w'==action || 'W'== action )
			    acctOne.withdraw(amount);
			else if ('d' == action || 'D'== action )
			    acctOne.deposit(amount);
			else 
			    System.out.println("Sorry, invalid action.");
		    else if (acctTwo.getAcctNumber() == acctNumber)
			if ('w'==action || 'W'==action)
			    acctOne.withdraw(amount);
			else if ('d'==action || 'D'==action )
			    acctOne.deposit(amount);
			else 
			    System.out.println("Sorry, invalid action.");
		    else
			System.out.println("Sorry, invalid account number.");
		else
			System.out.println("Sorry, amount must be > 0.");


		System.out.print("\nMore transactions? (y/n)");
		keepGoing = scan.next().charAt(0);
       }


	//Print number of deposits
	System.out.print("\nNumber of deposits: " + (int)Account.getInfo(Account.InfoType.DEPOSIT_COUNT));
	
	//Print number of withdrawals
	System.out.print("\nNumber of withdrawals: " + (int)Account.getInfo(Account.InfoType.WITHDRAWAL_COUNT));
	
	//Print total amount of deposits
	System.out.print("\nTotal money deposited: " + Account.getInfo(Account.InfoType.DEPOSIT_AMOUNT));

	//Print total amount of withdrawals
	System.out.print("\nTotal money withdrawed: " + Account.getInfo(Account.InfoType.WITHDRAWAL_AMOUNT));

    }
}
			


		
