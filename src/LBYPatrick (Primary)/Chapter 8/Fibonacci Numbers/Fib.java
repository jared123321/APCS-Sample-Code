
import java.util.Scanner;

public class Fib {
    static public void printf(String message) {
        System.out.print(message);
    }
    
    static private class Fibonacci {
        public static int getAnswer (int num) {
            if(num < 2) return num;
            else {return getAnswer(num - 1) + getAnswer (num - 2);}
        }
    }

    static public void main (String [] args) {
        
        int num, fib;

        Scanner scan = new Scanner(System.in);

        printf("Enter an integer: ");
        num = scan.nextInt();

        printf("Fib (" + num + ") is " + Fibonacci.getAnswer(num));
    }
}