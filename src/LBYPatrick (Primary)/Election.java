/**
 *  Election.java (Lab 3.7 Direction)
 *  @author Lewis/Patel
 *  @version 9.12.08
 *
 *   This file contains a program that tallies the results of
 *   an election.  It reads in the number of votes for each of
 *   two candidates in each of several precincts.  It determines
 *   the total number of votes received by each candidate, the
 *   percent of votes received by each candidate, the number of
 *   precincts each candidate carries, and the
 *   maximum winning margin in a precinct.
 */

import java.util.Scanner;

public class Election
{
    /**
     *	main method-
     *  @param args
     */

    public static void main (String[] args)
    {

        int votesForPolly;  // number of votes for Polly in each precinct
        int votesForErnest; // number of votes for Ernest in each precinct
        int totalPolly      = 0;     // running total of votes for Polly
        int totalErnest     = 0;    // running total of votes for Ernest
        char response;      // answer ('y' or 'n') to the "more precincts" question
        int pollyStates     = 0;
        int ernestStates    = 0;
        int tieStates       = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println ();
        System.out.println ("Election Day Vote Counting Program");
        System.out.println ();

        // Loop to "process" the votes in each precinct
        do{
          System.out.print("\nPlease enter vote for Polly in the current precinct:");
          votesForPolly = scan.nextInt();

          System.out.print("Please enter vote for Ernest in the current precinct:");
          votesForErnest = scan.nextInt();

          totalPolly += votesForPolly;
          totalErnest += votesForErnest;

          pollyStates += (votesForPolly > votesForErnest)? 1:0;
          ernestStates += (votesForErnest > votesForPolly)? 1:0;
          tieStates += (votesForPolly == votesForErnest)? 1:0;

          System.out.print("Do you want to enter another precinct?[Y/N]:");
          response = Character.toUpperCase(scan.next().charAt(0));
        }while(response == 'Y');
        // Print out the results
        System.out.println("\n\nResult:\n" + 
                           "\n\tPolly's precincts:     " + pollyStates + 
                           "\n\tErnest's precincts:    " + ernestStates +
                           "\n\tTie States:            " + tieStates + 
                           "\n\tPolly's total votes:   " + totalPolly + "\tPercentage:" + (100*(double)totalPolly/((double)totalPolly+(double)totalErnest)) + "%" +
                           "\n\tErnest's total votes:  " + totalErnest + "\tPercentage:" + (100*(double)totalErnest/((double)totalErnest+(double)totalPolly)) + "%");
    }
}
