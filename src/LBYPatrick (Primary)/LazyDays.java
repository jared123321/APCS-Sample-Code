import java.util.Scanner;

public class LazyDays{

    final private static class variableSpace {
        public double temperature = 0.0;
        public String suggestedActivity = new String();
    }

    final private static void findActivity(variableSpace obj){
   
        if(obj.temperature >= 80.0) obj.suggestedActivity = "swimming";
        else if(60.0 <= obj.temperature && obj.temperature < 80.0) obj.suggestedActivity = "tennis";
        else if(40.0 <= obj.temperature && obj.temperature < 60.0) obj.suggestedActivity = "golf";
        else if (obj.temperature < 40.0) obj.suggestedActivity = "skiing";

        //One if clause that overwrites the suggested activity for "Visit our shops"
        if (obj.temperature > 95.0 || obj.temperature < 20.0) obj.suggestedActivity = "Visit our shops!";
    }

    public static void main(String [] args){
        
        Scanner scan = new Scanner(System.in);
        final variableSpace temp = new variableSpace();

        System.out.printf("Please enter the today's temperature:");
        temp.temperature = scan.nextDouble();
        
        findActivity(temp); //Advanced Programming at this time

        System.out.println("Suggested Activity: " + temp.suggestedActivity);
    }
}