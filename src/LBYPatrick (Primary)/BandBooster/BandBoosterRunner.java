import java.util.Scanner;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;


public class BandBoosterRunner {
    public static void main(String [] args){
        String inputBuffer;
        int    inputBuffer_int;
        ArrayList<BandBooster> bands = new ArrayList<BandBooster>();
        Scanner scan = new Scanner(System.in);
        int weeks;

        //Read band names
        for(int i = 0; i < 3; ++i) {
            BandBooster bandBuffer;
            System.out.print("Please Enter the name for the band #" + (i+1) + ": ");
            inputBuffer = scan.next();
            bandBuffer = new BandBooster(inputBuffer);
            bands.add(bandBuffer);
            System.out.print("\n");
        }

        System.out.print("Please enter the number of weeks for the current fundraising Campaign: ");
        weeks = scan.nextInt();
        
        //Read boxes sold in each week
        for(int n = 0; n < weeks; n++) {
            System.out.print("Week " + (n+1) + "\n");
            System.out.print("===================================\n");
            for(int i = 0; i < 3; i++) {
                System.out.print("Please enter number of boxes sold by " +bands.get(i).getName() + " this week: ");
                inputBuffer_int = scan.nextInt();
                bands.get(i).updateSales(inputBuffer_int);
            }
        }

        //Final output
        for(BandBooster temp : bands) { System.out.print(temp.toString() + "\n");}
    }
}