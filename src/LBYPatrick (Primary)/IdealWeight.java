import java.util.Scanner;

public class IdealWeight {
    private static int convertToInch(int feet, int inch) {
        return (feet*12)+inch;
    }

    private static void printf(String text, boolean toNewLine){
        if (toNewLine) System.out.print("\n");
        System.out.print(text);
    }

    public static void main(String [] args) {
        
        
        Scanner obj=new Scanner(System.in);
        String height;
        int feet;
        int inch;
        int heightInInch;
        int optimalWeight_Male;
        int optimalWeight_Female;


        // ======================
        // Collect information
        // ======================

        printf("Please enter your height (the first part \"Feet\"):",true);feet=obj.nextInt();
        printf("Please enter your height (the second part \"Inch\":)",true);inch=obj.nextInt();       

        // ======================
        // Start Calculating
        // ======================
        heightInInch = convertToInch(feet,inch);
        

        // ===============================
        // Calculate Male's Optimal Weight
        // ===============================
        if (heightInInch >= 60) optimalWeight_Male = 100 + ((heightInInch-60)*6); //For male over/on 5 ft
        else optimalWeight_Male = 100 - ((60-heightInInch)*6); // For male under 5 ft


        // =================================
        // Calculate Female's Optimal Weight
        // =================================
        if (heightInInch >= 60) optimalWeight_Female = 100 + ((heightInInch-60)*5); //For female over/on 5 ft
        else optimalWeight_Female = 100 - ((60-heightInInch)*5); // For female under 5 ft


        // =================================
        // Output Results
        // =================================

        printf("Analysis Complete.\n",true);
        printf("Your Height: " + feet + "\'" + inch, true);

        printf("Optimal weight if you are a male: " 
                + optimalWeight_Male*0.85 
                + " pounds~~" 
                + optimalWeight_Male*1.15 
                + " pounds", true);

        printf("Optimal weight if you are a female: " 
                + optimalWeight_Female*0.85
                + " pounds~~" 
                + optimalWeight_Female*1.15 
                + " pounds", true);
                        
    }
}