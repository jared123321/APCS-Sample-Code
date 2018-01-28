/**
*    @author Lewis/Patel
*    @version 1.1  9/17/10
*    Credit Card Template. 
*/
import java.util.Scanner;
import java.text.NumberFormat;

public class CreditCard
{ 
	/**
	  * Main Method: 
	  * @param args
	  */
	public static void main (String[] args)
	{
		//declare variables
		Scanner scan = new Scanner(System.in);
        double previousAmount = 0;
        double additionalCharge = 0;
        final double interestRate = 0.02;
        double interest = 0;
        double minPayment = 0;
        double currentAmount = 0;

	
	
		//prompt user for information
        System.out.printf("Enter Previous Balance:");
        previousAmount = scan.nextDouble();
        System.out.printf("Enter additional Charge:");
        additionalCharge = scan.nextDouble();
    	

		//set up your conditionals

        if(previousAmount > 0){interest = previousAmount * interestRate;}

        currentAmount = previousAmount + additionalCharge + interest;
        
        if(currentAmount <= 50) minPayment = currentAmount;
        else if(currentAmount > 50 && currentAmount <= 300) minPayment = 50;
        else if(currentAmount > 300) minPayment = currentAmount * 0.2;

		NumberFormat money = NumberFormat.getCurrencyInstance();
		
		
		
		System.out.println("CS CARD International Statement");
		System.out.println("===============================");
		System.out.println("");
		System.out.println(" Previous Balance:			" + money.format(previousAmount));
		System.out.println(" Additional Charges:			" + money.format(additionalCharge));
		System.out.println(" Inerest:				" + money.format(interest));
		
		System.out.println(" New Balance:				" + money.format(currentAmount));
		System.out.println(" Minimum Payment:			" + money.format(minPayment));
		System.out.println();
		
		
	}
}
