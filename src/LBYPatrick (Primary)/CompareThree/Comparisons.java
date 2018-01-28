import java.util.*;

public class Comparisons {
    public static void main(String [] args) {
        
        Scanner scan = new Scanner(System.in);
        List<Comparable> compareStringList = new ArrayList<Comparable>();
        List<Comparable> compareIntList = new ArrayList<Comparable>();
        Comparable inputBuffer;
        Integer intInputBuffer;

        System.out.printf("String mode\n================================\n\n");

        for(int i = 0; i < 3; ++i) {
            System.out.printf("Please enter value #" + (i+1) + ": ");
            inputBuffer = scan.next();
            compareStringList.add(inputBuffer);
            System.out.printf("\n");
        }

        System.out.printf("In these three strings, the \"largest\" one is: " 
        + CompareThree.largest(compareStringList.get(0),compareStringList.get(1),compareStringList.get(2)) 
        + "\n");

        System.out.printf("Integer mode\n================================\n\n");

        for(int i = 0; i < 3; ++i) {
            System.out.printf("Please enter integer #" + (i+1) + ": ");
            intInputBuffer = scan.nextInt();
            compareIntList.add((Comparable)intInputBuffer);
        }

        System.out.printf("In these three integers, the \"Largest\" one is: " 
        + CompareThree.largest(compareIntList.get(0),compareIntList.get(1),compareIntList.get(2)) 
        + "\n");
    }
}