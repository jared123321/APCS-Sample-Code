/**
 * Account.java (Directions)
 *
 * A bank account class with methods to deposit, withdraw, 
 * and check the balance.
 */
public class Account
{
	enum InfoType {
		DEPOSIT_COUNT,
		WITHDRAWAL_COUNT,
		DEPOSIT_AMOUNT,
		WITHDRAWAL_AMOUNT
	}
	
	//instance data member for Account class
	private double balance;
	private String name;
	private long acctNum;
	private static int totalWCount = 0;
	private static int totalDCount = 0;
	private static double totalW = 0;
	private static double totalD = 0;
	
	/**
	 * Constructor -- initializes balance, owner, and account number
	 * @param initBal given from driver
	 * @param owner of the account
	 * @param number for bank account
	 */
	//throw an exception in the constructor
	public Account(double initBal, String owner, long number)
	{
        balance = initBal;
		name = owner;
		acctNum = number;
	}
	
	/**
	 * Checks to see if balance is sufficient for withdrawal.
	 * If so, decrements balance by amount; if not, prints message.
	 * @param amount of money to withdraw from account
	 */
	public void withdraw(double amount)
	{
        //
		if (balance >= amount) {
			balance -= amount;
			Account.totalWCount += 1;
			Account.totalW += amount;
		}
		else
		    System.out.println("Insufficient funds");
	
	}
	
	/**
	 * Adds deposit amount to balance.
	 * @param amount of money to be added
	 */
	public void deposit(double amount)
	{
		balance += amount;
		Account.totalDCount += 1;
		Account.totalD += amount;
	}
    
    /**
	 * 
	 */
	public void transfer(Account acct, double amount)
	{
		this.withdraw(amount);
		acct.deposit(amount);
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
	 * Returns account number
	 * @return acctNum the account number
	 */
	public double getAcctNumber()
	{
        return acctNum;
	}
	
	/**
	 * Prints account number, name, and balance
	 */
	// re-write as a toString() method. Do not delete printSummary() method.
	public void printSummary()
	{
        System.out.println("Account number: " + acctNum);
	    System.out.println("Account owner: " + name);
	    System.out.println("Account balance: " + balance);
    }  
	public static int getNumDeposits() {
		return totalDCount;
	}

	public static double getInfo(InfoType info) {
		switch (info) {
			case WITHDRAWAL_AMOUNT : return Account.totalW;
			case WITHDRAWAL_COUNT  : return Account.totalWCount;
			case DEPOSIT_AMOUNT    : return Account.totalD;
			case DEPOSIT_COUNT	  : return Account.totalDCount;
			default : return 256;
		}
	}
}
