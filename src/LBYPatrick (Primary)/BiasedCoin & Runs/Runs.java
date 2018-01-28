/**
 * Runs.java (directions)
 * @author Patel/Lewis
 * @version 10/20/10
 * Finds the length of the longest run of heads in 100 flips of a coin.
 *
 */
import java.util.*;

public class Runs
{
	/**
	 * main method
	 * @param args
	 */
	public static void main (String[] args)
	{
		final int FLIPS = 100; // number of coin flips

		int currentRun = 0; // length of the cursrent run of HEADS
		int maxRun = 0;     // length of the maximum run so far

		BiasedCoin obj = new BiasedCoin(); // Create a coin object

		// Flip the coin FLIPS times
		for (int i = 0; i < FLIPS; i++)
		{
			++maxRun;
			obj.flip();
			System.out.println("Run #" + maxRun + ": " + obj.toString());
			currentRun += (obj.getFace() == 0? 1 : 0);
		}
		// Print the results
		System.out.print("\nResults\n\n\tHEADS: " + currentRun + "\n\tTAILS: " + (maxRun - currentRun));
	}
}

