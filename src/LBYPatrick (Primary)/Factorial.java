import java.util.*;
public class Factorial{
    
    final public static long getFactorial(int originalNumber){
        
        long outputResult = originalNumber;

        if(originalNumber < 0) return -1;
        else if(originalNumber == 0) return 1;
        else {
             for(int i = originalNumber; i > 1; --i) outputResult *= i-1;
             return outputResult;
        }
    }

    public static void main(String [] args) {
        
        
        Scanner scan = new Scanner(System.in);
        System.out.print("\tPlease enter a number for getting the factorial:");
        
        while(true) {
            int input = scan.nextInt();
            
            long endResult = getFactorial(input);

            if(endResult == -1){
                System.out.printf("\n Invaild number. Please do not enter a negative value.\n\tPlease enter a number for getting the factorial:");
                continue;
            }
            else{System.out.printf("The factorial of your number: " + endResult);break;}
        }

    }

}