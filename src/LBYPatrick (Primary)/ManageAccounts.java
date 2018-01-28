/**
 *   ManageAccounts.java
 *   @author patel, Lewis
 *   @version 10/20/10
 *   Use Account class to create and manage Sally and Joe's 
 *   bank accounts       
 */

public class ManageAccounts
{
	/**
	 * main method:
	 * @param args
	 */
	public static void main(String[] args)
	{
		Account acctOne, acctTwo;

		//create accountOne for Sally with $1000
		acctOne = new Account(1000, "Sally", 1111);

		//create accountTwo for Joe with $500
		acctTwo = new Account(500, "Joe", 2222);

		//deposit $100 to Joe's account
		acctTwo.deposit(100);

		//print Joe's new balance (use getBalance())
		acctTwo.chargeFee();

		//withdraw $50 from Sally's account
		acctOne.withdraw(50);

		//print Sally's new balance (use getBalance())
		acctOne.chargeFee();

		//change the name on Joe's account to Joseph

		acctTwo.changeName("Joseph");

		//print summary for both accounts
		acctOne.printSummary();
		acctTwo.printSummary();
	}
}


