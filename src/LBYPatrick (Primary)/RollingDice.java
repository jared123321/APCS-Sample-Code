
import java.util.Random;

public class RollingDice {
    final private static int getRandInt(int min, int max) { //Something I learned from the FTC 2018 project

        Random randOBJ = new Random();
        
        int randNum = randOBJ.nextInt(100000); //Makes the number more random
        int outputNum = min - 1;

        if (randNum <= 0){
            randNum = 0 - randNum;
        }

        for(int i = 0; i < randNum; i++){ //Equal Distribution of possibility on each number
            outputNum += 1;
            if(outputNum > max) outputNum = min;
        }
        
        return outputNum;
    }

    final public static void main(String [] args) {

            int dieOne = getRandInt(1,6);
            int dieTwo = getRandInt(1,6);
            System.out.println("Result for Die 1: " + dieOne);
            System.out.println("Result for Die 2: " + dieTwo);
            System.out.println("Two dies in total: " + (dieOne + dieTwo));
    }
}