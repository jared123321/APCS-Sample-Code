/*
*	Guess.java (direction)
*
*	@author Lewis/Patel
*	@version 9.12.08    10/4/10
*	Play a game where the user guesses a number from 1 to 10
*          
*/

import java.util.Scanner;
import java.util.Random;

public class Guess
{
    /**
     * main method
     * @param args
     */
	final static Random generator = new Random();

	final static private int generateNumber(int min, int max){
		int tempNum = generator.nextInt(max*10000);
		int output = min - 1;
		for(int i = 0; i < tempNum; i++){
			output += 1;
			if(output > max) output = min;
		}
		return output;
	}

    public static void main(String[] args)
    {
     	int numToGuess;       //Number the user tries to guess
        int guess;            //The user's guess
		int guessCount = 1;
		int higher = 0;
		int lower = 0;
	Scanner scan = new Scanner(System.in);

	//randomly generate the  number to guess
	numToGuess = generateNumber(0,9999);

	//print message asking user to enter a guess
	System.out.printf("Enter your guess for the number I generated "+ "(Answer:"+ numToGuess +") :" );
	//read in guess with Scanner class
	//scan.nextInt();
    guess = scan.nextInt();            
	while (guess != numToGuess)  //keep going as long as the guess is wrong
	{
		    guessCount ++;
			if(guess > numToGuess) higher ++;
			else if(guess < numToGuess) lower ++;
			System.out.printf("\nYour guess is too "+ (guess < numToGuess? "Low" : "High") +". Keep Trying"+"(Guess Count:"+guessCount+"):");
			//print message saying guess is wrong
		    //get another guess from the user
			guess = scan.nextInt();  
	}
	System.out.printf("\nYour Guess is right!!!\n"
	+ "\tGuess Time in total: "
	+  guessCount 
	+ "\n\tHigh Count: "
	+ higher
	 + "\n\tLow Count: " 
	 + lower);
	//print message saying guess is right
    }
}

   
