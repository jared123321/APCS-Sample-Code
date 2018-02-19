public class ComparePlayers extends Player
{
    /**
     * @param args
     */
    public static void main(String[] args)
    {
        //
        Player playerOne = new Player();
        Player playerTwo = new Player();

        //Prompt for and read in information for player 1
        System.out.println("Player One");
        playerOne.readPlayer();
        //Prompt for and read in information for player 2
        System.out.println("Player Two");
        playerTwo.readPlayer();
        //Compare player1 to player 2 and print a message saying
        //whether they are equal

        if(playerOne.equals(playerTwo)){
            System.out.println("Players are equal!");
        }
        else{
            System.out.println("Players are not equal!");
        }

    }
}

