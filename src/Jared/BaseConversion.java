import java.util.Scanner;

public class BaseConversion {

    //global string because it is used in two methods

    static final String encodings = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ+/";

    public static void main(String[] args){

        Scanner in = new Scanner( System.in );

        //input

        System.out.println("Enter the number and the base");

        String input = in.nextLine();

        String number = input.split(" ")[0];

        int base = Integer.parseInt(input.split(" ")[1]);

        //convert the inputted number into decimal

        int decimal = toDecimal(number, base);

        //convert it into each base between 2 and 63

        for( int i = 2; i<64; i++){

            System.out.println("In base "+i+":"+toBase(decimal, i));

        }

    }

    static int toDecimal(String number, int base){

        //convert the number of given base into decimal

        int len = number.length();

        int i,count = 0;

        int decimal = 0;

        for( i=len-1; i>=0; i--){

            decimal += encodings.indexOf(number.charAt(i)) * (int)Math.pow(base,count++);

        }

        return decimal;

    }

    static String toBase( int decimal, int base){

        //convert the number in decimal to given base

        String converted="";

        while( decimal!=0 ){

            int rem = decimal%base;

            converted = encodings.charAt(rem)+converted;

            decimal /= base;

        }

        return converted;

    }

}
