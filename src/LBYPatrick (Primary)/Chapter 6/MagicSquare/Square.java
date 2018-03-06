/**
 * Square.java Part Six
 *
 * @author Lewis
 * @version  4.8.13
 *
 * Define a Square class with methods to create and read in
 * info for a square matrix and to compute the sum of a row,
 * a col, either diagonal, and whether it is magic.
 *         
 */

import java.util.Scanner;

import java.io.File;

public class Square
{

	private int[][] square;
	private Scanner scan;
    private Scanner scanFile;
	private int size;
	private static int totalSquares = 0;
	
    /**
	 *  create new square to test magic squares 
	 */
	 public Square()
	 {

	 }

	/** 
	 * @param row  the row number
	 * @return the sum of the vainlues the given row
	 */
	 public int sumRow(int row)
	 {
		int returnBuffer = 0;
		int startPosition = 0;
		int endPosition   = this.square[row].length - 1;
		
		for(int i = startPosition; i <= endPosition; ++i) {returnBuffer += this.square[row][i];}

		return returnBuffer;
	 }

	/**
	 * return the sum of the values in the given column
	 * 
	 * @param col the column number
	 * @return the sum of the values
	 */
	 public int sumCol(int col)
	 {
		int returnBuffer = 0;
		final int startPosition = 0;
		final int endPosition   = this.square.length - 1;

		for(int i = startPosition; i <= endPosition; ++i) {returnBuffer += this.square[i][col];}
		
		return returnBuffer;
		
	 }

	/** 
	 * @return ______  the sum of the values in the main diagonal
	 */
	 public int sumMainDiag()
	 {
		int returnBuffer = 0;

		for(int i = 0; i <= size - 1; ++i) {returnBuffer += this.square[i][i];}

		return returnBuffer;
	 }

	/**
	 * @return ______ the sum of values in the other ("reverse") diagonal
	 */
	 public int sumOtherDiag()
	 {
		int returnBuffer = 0;

		for(int i = 0; i <= size - 1; ++i) {returnBuffer += this.square[i][this.size - 1 - i];}

		return returnBuffer;
	 }

	/**
	 * @ return ______ true if the square is magic (all rows, cols, and diags have
	 * same sum), false otherwise
	 */
	 public boolean magic()
	 {
		
		 int [] sumRows  = new int[size];
		 int [] sumCols  = new int[size];
		 int [] sumDiags = new int[2];

		 for(int i = 0; i < size; ++i) {
			 sumRows[i] = this.sumRow(i);
			 sumCols[i] = this.sumCol(i);
		 }

		 sumDiags[0] = this.sumMainDiag();
		 sumDiags[1] = this.sumOtherDiag();

		for(int i = 0; i < size - 2; ++i) {
			if(sumRows[i] != sumRows[i+1] || sumCols[i] != sumCols[i+1]) return false;
		}

		if(sumDiags[0] != sumDiags[1]) return false;

		if(sumRows[0] != sumCols[0] || sumRows[0] != sumDiags[0]) return false;

		return true;

	 }

	/**
	 * read data from text file into the square and determines if
     * it is a magic square.
	 */
	 
	 public void readSquare(String filename)
	 {
		String readBuffer = new String();
		boolean isSqureDetected = false;
		int currentLine = 0;
		boolean isFirstSquare = true;
		//intiate scanFile
		try{
		this.scanFile = new Scanner(new File(filename));  
		} catch (Exception e) {};
		//while to keep checking for magic square
         //until the -1 value in the textfile is read
        while(scanFile.hasNext())
        {
			readBuffer = scanFile.nextLine();
			String [] elements = getRawArray(readBuffer).split(" ");
			
			if(elements.length == 1) { 

				if (!isFirstSquare) {	
				this.printSquare();
				System.out.printf("Magic Square : " + (this.magic()? "Yes" : "No") + "\n\n");
				}

				if(elements[0].equals("-1")) break;
				
				isFirstSquare = false;
				currentLine = 0;
				size = Integer.parseInt(elements[0]);
				this.square = new int[size][size];
				continue;
			}
				currentLine ++;
				for(int i = 0; i < size; ++i) {this.square[currentLine - 1][i] = Integer.parseInt(elements[i]);}
		
        }
	 }

	/**
	 * print the contents of the square, neatly formatted
	 */
	 public void printSquare()
	 {
		totalSquares ++;
		System.out.printf("\nSquare " + totalSquares +": \n");

		for(int [] currentRow : this.square) {
			boolean isFirstElement = true;
			int counter = 0;

			for(int currentCol : currentRow) {
				counter ++;
				
				if(!isFirstElement) System.out.printf("\t");

				System.out.printf(Integer.toString(currentCol));
				
				isFirstElement = false;
			}
			
			System.out.printf("\n");

		}
	 }
	public static String getRawArray(String input) { 
		
		String returnBuffer = new String();
		char lastCharBuffer = 'a';

		int startPosition = 0;
		final int endPosition   = input.length() - 1;

		if(input.charAt(0) == ' ') startPosition += 1;

		for(int i = startPosition; i <= endPosition; ++i) {
			if(input.charAt(i) == ' ' && lastCharBuffer == ' ') continue;
			
			returnBuffer += input.charAt(i);
			lastCharBuffer = input.charAt(i);
		}
		return returnBuffer;
	}
}
