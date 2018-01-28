/**
 * Account.java (Direction)
 * @author ppatel
 * @version 10/23/09
 *
 * A bank account class with methods to deposit to, withdraw from,
 * change the name on, charge a fee to, and print a summary of the account.
 */
import java.*;

public class Account
{
    //
	  private double balance;
	  private String name;
	  private long acctNum;
    
    /**
     *
     *
     */
    public Account()
    {
        
    }
	  /**
	   *  Constructor -- initializes balance, owner, and account number
	   *  @param initBal the inital balance of the account
	   *  @param owner the name of the account holder
	   *  @param number the account number
	   */
	  public Account(double initBal, String owner, long number)
	  {
	    	balance = initBal;
	    	name = owner;
	    	acctNum = number;
	  }

	  /**
	   * Checks to see if balance is sufficient for withdrawal.
	   * If so, decrements balance by amount; if not, prints message.
	   * @param amount the amount to withdraw
	   */
	  
	  public void withdraw(double amount)
	  {
		  //
		    if (balance >= amount)
		           balance -= amount;
		    else
		           System.out.println("Insufficient funds");
	  }

	 /**
	  * Adds deposit amount to balance.
	  * @param amount the amount of money to deposit
	  */
	  
	  public void deposit(double amount)
	  {
	    	balance += amount;
	  }

	  /**
	   * Returns balance.
	   * @return balance the current balance
	   */
	  public double getBalance()
	  {
		return balance;
	  }


	  /**
	   * Prints name, account number, and balance.
	   */
	  public void printSummary()
	  {
	    //print name
		System.out.println("Name:           " + name);
	    //print acct number
		System.out.println("Account Number: " + acctNum);
	    //print balance
		System.out.println("Balance:        " + balance);
	  }

	  /**
	   * Deducts $10 service fee if balance is under $1000
	   */
	   
	  public double chargeFee()
	  {
	    if(balance < 1000) balance -= 10;
		System.out.println("New balance: " + balance);
		return balance;
	  }
	  
	  // write definition for get method for each instence data member
	  
	  
	  /**
	   * Changes the name on the account 
	   * @param newName the new name to apply to the account
	   */
	  public void changeName(String newName)
	  {
	    name = newName;
	  }
	  //write a toString method definition
}

