/**
 * Player.java (Lab Five)
 * @author Lewis/Smith
 * @version 4/13/13
 * Defines a Player class that holds information about an athlete.
 */

import java.util.Scanner;

public class Player
{
    //
    public String name;
    public String team;
    public int jerseyNumber;

    /**
     * Prompts for and reads in the player's name, team, and 
     * jersey number.
     *
     */

	    public void readPlayer()
	    {
			Scanner scan = new Scanner(System.in);
					
			System.out.print("Name: ");
			this.name = scan.nextLine();
			
			System.out.print("Team: ");
			this.team = scan.nextLine();
			
			System.out.print("Jersey number: ");
			this.jerseyNumber = Integer.parseInt(scan.next());
		}

		public boolean equals(Player another) {
			if(this.name.compareTo(another.name) == 0 && this.team.compareTo(another.team) == 0 && this.jerseyNumber == another.jerseyNumber) return true;
			else return false;
		}

}
