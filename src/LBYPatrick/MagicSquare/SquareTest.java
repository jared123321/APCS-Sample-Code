/**
 * SquareTest.java (Part Six)
 * @author Lewis
 * @version 12.8.13
 *
 * Uses the Square class to read in square data and tell if 
 * each square is magic.
 *          
 */

import java.util.Scanner;
import java.io.File;

public class SquareTest
{
	static Scanner reader = new Scanner(System.in);
	static String inputBuffer = new String();
	static Square mSquareObject = new Square();
	/**
	 *	@param args
	 *
	 */
	public static void main(String[] args)
	{
		
		System.out.print("File name:");
		inputBuffer = reader.next();
		
		mSquareObject.readSquare(inputBuffer);

    }
}