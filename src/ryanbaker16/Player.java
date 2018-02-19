import java.util.Scanner;

public class Player
{
    //
    private String name;
    private String team;
    private int jerseyNumber;

    /**
     * Prompts for and reads in the player's name, team, and
     * jersey number.
     *
     */

    public void readPlayer()
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Name: ");
        name = scan.next();

        System.out.print("Team: ");
        team = scan.next();

        System.out.print("Jersey number: ");
        jerseyNumber = scan.nextInt();

    }

    public String getTeam(){
        String a = this.team;
        return a;
    }

    public int getJerseyNumber(){
        int b = this.jerseyNumber;
        return b;
    }

    public boolean equals(Player p) {


        if((this.team.equals(p.team)) && (this.jerseyNumber == p.jerseyNumber))
            return true;
        else
            return false;




}
}

