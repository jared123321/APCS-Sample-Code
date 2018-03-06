import java.util.*;


public class Rock {
    
    private static Scanner scan = new Scanner(System.in);

    final private static class tempSpace{
        public String originalChoice = new String();
        public String randomChoice = new String();
        public int resultState = 0;
        final public void computeResult() {
            originalChoice = originalChoice.toUpperCase();
            if(originalChoice.indexOf("R") != -1) { //Rock
                if(randomChoice == "R") resultState = 1;
                else if(randomChoice == "P") resultState = 2;
                else if(randomChoice == "S") resultState = 0;
            }
            if(originalChoice.indexOf("P") != -1){ //Paper
                if(randomChoice == "R") resultState = 0;
                else if(randomChoice == "P") resultState = 1;
                else if(randomChoice == "S") resultState = 2;
            }
            if(originalChoice.indexOf("S") != -1){
                if(randomChoice == "R") resultState = 2;
                else if(randomChoice == "P") resultState = 0;
                else if(randomChoice == "S") resultState = 1;
            }
        } 
    }
    final private static int getRandInt(int min, int max) { //Something I learned from the FTC 2018 project

        Random randOBJ = new Random();
        
        int randNum = randOBJ.nextInt(100000), //Makes the number more random
            outputNum = min - 1;

        if (randNum <= 0) randNum = 0 - randNum;

        for(int i = 0; i < randNum; i++){ //Equal Distribution of possibility on each number
            outputNum += 1;
            if(outputNum > max) outputNum = min;
        }
        return outputNum;
    }


    public static void main(String [] args) {
        
        final tempSpace temp = new tempSpace();
    
        switch (getRandInt(0,2)){
            case 0 : temp.randomChoice = "R";break;
            case 1 : temp.randomChoice = "P";break;
            case 2 :temp.randomChoice = "S";break;
        }

        System.out.print("Enter your play(R,P or S): ");
        temp.originalChoice = scan.next();

        System.out.println("Computer play is: " + temp.randomChoice);

        temp.computeResult();

        System.out.print("Result: ");

        switch(temp.resultState){
            case 0 : System.out.printf("Win");break;
            case 1 : System.out.printf("Tie");break;
            case 2 : System.out.printf("Lose");break;
        }

    }
}