//Jared Singeltary
//2.27.18
//Period:3
//DigitalPLay

import java.util.Scanner;

public class DigitPlay

{

    public static void main (String[] args)

    {

        int num; //a number

        Scanner scan = new Scanner(System.in);

        while (true)

        {

          System.out.println("Please enter a positive integer: ");

          num = scan.nextInt ();

          if (num <= 0)

            System.out.println ( num + " isn't positive -- start over!!");

          else

          {

            // Call numDigits to find the number of digits in the number

            // Print the number returned from numDigits

            System.out.println ("\nThe number " + num + " contains " +

                                + numDigits(num) + " digits.");

            System.out.println ();

            System.out.println ("\nThe number " + num + "'s sum is: " +

                                + sumDigits(num));

            System.out.println ();

          }

        }

    }



    // -----------------------------------------------------------

    // Recursively counts the digits in a positive integer

    // -----------------------------------------------------------



    public static int numDigits(int num)

    {

        int totalDigits = 0;



        if ((num % 10) == 0)

            return 0;



        else

            return (totalDigits + 1) + numDigits(num/10);



    }

    

    public static int sumDigits(int num)

    {

      int sumOFDigits = 0;

      

      if ((num % 10) == 0)

        return 0;

      

      else

        return (num % 10) + sumDigits(num/10);

      

    }

}