/**
 *  StringManips.java (Direction)
 * 	Code Description: Test several methods for manipulating String objects
 * 	@author vpatel
 *	@version 9/15/08    9/9/13
 *   @contact patelv@lschs.org
 */
import java.util.Scanner;

public class StringManips
{
	/**
	 * main Method - manipulating string objects
	 *	@param args
	 */
	public static void main (String[] args)
	{
		String phrase = new String ("This is a String test.");
		String firstHalf = new String();   // first half of the phrase String
		String secondHalf = new String();  // second half of the phrase String
		String switchedPhrase = new String(); // a new phrase with original halves switched
		String middleThree = new String();
		String switchedPhrase_Buffer = new String();
		String city,state = new String();
		Scanner scan = new Scanner(System.in);
		
		
		int phraseLength;   // number of characters in the phrase String
		int middleIndex;    // index of the middle character in the String

		// compute the length and middle index of the phrase
		phraseLength = phrase.length();
		middleIndex = phraseLength/2;

		// get the substring for each half of the phrase
		firstHalf = phrase.substring(0,middleIndex);
		secondHalf = phrase.substring(middleIndex, phraseLength);
        middleThree = phrase.substring(middleIndex-1, middleIndex+1);

		// concatenate the firstHalf at the end of the secondHalf
		switchedPhrase = secondHalf.concat(firstHalf);
		for (int i = 0; i < phraseLength; i++){
			if (switchedPhrase.charAt(i) == ' ') {switchedPhrase_Buffer += "*";}
			else {switchedPhrase_Buffer += switchedPhrase.charAt(i);}
		}
		switchedPhrase = switchedPhrase_Buffer;

		// print information about the phrase
		System.out.println();
		System.out.println("Original phrase: " + phrase + 
						   "\n" + 
						   "Length of the phrase: " + phraseLength + " characters" +
						   "\n" +
						   "Index of the middle: " + middleIndex +
						   "\n" +
						   "Character at the middle index: " + phrase.charAt(middleIndex) +
						   "\n" +
						   "Switched phrase: " + switchedPhrase + "\n"
						   );
		System.out.println("The middle three characters: " + middleThree);

		for(int i = 0; i < 4;i++) System.out.println();

		System.out.print("Please enter your state:");
		state = scan.nextLine();
		System.out.print("\nPlease enter your city:");
		city = scan.nextLine();

		System.out.println("Output: " + state.toUpperCase() + city.toLowerCase() + state.toUpperCase());
	}
}







