
/**
 *  MiniQuiz.java       
 *  @author: Lewis/Loftus
 *  @version 10/4/07
 *  Demonstrates the use of a class that implements an interface.
 */
import java.util.Scanner;

public class MiniQuiz
{
	private 	static String possible = new String();
	private 	static Scanner scan = new Scanner(System.in);
	/**
	 * Presents a short quiz.
	 * @param args
	 */

	public static void main (String[] args) {
		Question qOne, qTwo;

		qOne = new Question ("What is the capital of Jamaica?","Kingston");
		qOne.setComplexity (4);

		qTwo = new Question ("Which is worse, ignorance or apathy?",
					 "I don't know and I don't care");
		qTwo.setComplexity (10);

		askQuestion(qOne);
		askQuestion(qTwo);
	}

	private static void askQuestion(Question object) {
		System.out.print (object.getQuestion());
		System.out.println (" (Level: " + object.getComplexity() + ")");
		possible = scan.nextLine();
		if (object.answerCorrect(possible)) System.out.println ("Correct");
	
		else System.out.println ("No, the answer is " + object.getAnswer());
		
		System.out.printf("\n");
	}
}

