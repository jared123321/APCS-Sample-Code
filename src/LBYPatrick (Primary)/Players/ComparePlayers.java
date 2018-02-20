/**
 * ComparePlayers.java (Lab Five)
 * @author Lewis/Smith
 * @version 4/13/13
 *
 * Reads in two Player objects and tells whether they represent
 * the same player.
 */
 

import java.util.ArrayList;
import java.util.Arrays;

public class ComparePlayers
{
    /**
     * @param args
     */
    public static void main(String[] args)
    {
		Player playerOne = new Player(),playerTwo = new Player();
        ArrayList<Player> players = new ArrayList<>(Arrays.asList(playerOne,playerTwo));

        //Read information
        for(int i = 0; i < players.size(); ++i) {
            System.out.printf("\n");
            players.get(i).readPlayer();
        }
        
		//Compare player1 to player 2 and print a message saying
		//whether they are equal
        System.out.printf(players.get(0).equals(players.get(1)) ? "These two players are the same" : "These two players are not the same");

    }
}
	    
