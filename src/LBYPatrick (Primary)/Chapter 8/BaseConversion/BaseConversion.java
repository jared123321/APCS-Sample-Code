import java.util.Scanner;

public class BaseConversion {
    public static String convert(int num, int base) {
        String qBuffer = "";
        String returnBuffer = "";

        int quotient = num;
        int remainder = 0;

        //No recursion, while loop should be good enough
        while(quotient != 0) {
            remainder = quotient% base;
            qBuffer += remainder;
            quotient = (quotient-remainder) / base;
        }
        
        for(int i = qBuffer.length()-1; i >= 0; --i) {
            returnBuffer += qBuffer.charAt(i);
        }

        return returnBuffer;
    }

    public static void main(String [] args) {
        
        Scanner scan = new Scanner(System.in);
        int inputNumber;
        int inputBase;

        System.out.print("Please enter the number you want to convert:");
        inputNumber = scan.nextInt();
        System.out.print("Please enter the base:");
        inputBase = scan.nextInt();

        System.out.println("\nThe Final converted data is: " + convert(inputNumber,inputBase));
    }
}