import java.util.Scanner;

public class AccountTest {
    
    public static void main(String [] args) {
        
        Scanner scan = new Scanner(System.in);

        Account acctOne = null;
        Account acctTwo = null;
        boolean isToAcctTwo = false;
        boolean isFirstUser = true;
        String inputBuffer = new String();
        double transAmount = 0;
        
        String name = new String();
        long accountNumber = 0;
        double initBal = 0;
        
        for(int i = 0; i < 2; ++i) {
            System.out.print("\nUser #"+ (i+1) + "\n\n");
            System.out.print("\tPlease enter holder name:");
            name = scan.next();
            System.out.print("\tPlease enter account number:");
            accountNumber = scan.nextLong();
            System.out.print("\tPlease enter initial balance:");
            initBal = scan.nextDouble();

            if(isFirstUser){ isFirstUser = false; acctOne = new Account(initBal,name,accountNumber);}
            else acctTwo = new Account(initBal,name,accountNumber);

        }

        while(true) {
            
            System.out.printf("acctOne to acctTwo? Or the other way? [Y/N] Type \"Quit\" to quit program:");
            
            inputBuffer = scan.next();
            if(inputBuffer.toLowerCase().contains("quit")) break;
            else if(inputBuffer.toLowerCase().contains("y")) isToAcctTwo = true;
            else if(inputBuffer.toLowerCase().contains("n")) isToAcctTwo = false;
            else System.out.printf("Answer invalid, acctOne would transfer to acctTwo by default.");
            
            System.out.printf("Please enter the amount of money you want this transaction to transfer (\"Quit\" for quit): ");
            inputBuffer = scan.next();
            if(inputBuffer.toLowerCase().contains("quit")) break;
            else transAmount = Double.parseDouble(inputBuffer);
            
            if(isToAcctTwo) acctOne.transfer(acctTwo, transAmount);
            else acctTwo.transfer(acctOne, transAmount);
        } 

        acctOne.printSummary();
        System.out.print("\n");
        acctTwo.printSummary();
    }

}