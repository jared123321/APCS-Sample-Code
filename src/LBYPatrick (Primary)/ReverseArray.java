
import java.util.Scanner;

final class ReverseArray {
    final public static void main(String [] args) {
        
        Scanner scan = new Scanner(System.in);
        int [] elements;
        int arraySize = 0;
        boolean isFirstElement = true;
        int elementBuffer = 0;

        System.out.printf("Please enter the length of the array: ");
        arraySize = Integer.parseInt(scan.next());

        elements = new int[arraySize];

        for(int i = 0; i < arraySize; ++i) {
            System.out.printf("\tPlease enter element #" + (i+1) + ": ");
            elements[i] = Integer.parseInt(scan.next());
        }

        System.out.printf("\nDone with collecting array values, reversing now...");
        System.out.printf("\nOriginal Array: [");
        for (int temp : elements) {
            if(!isFirstElement) System.out.printf(", ");
            System.out.printf(temp + "");
            isFirstElement = false;
        }
        System.out.printf("]\n");

        final int rotationNeeded = (arraySize - (arraySize%2 != 0? 1 : 0))/2; 

        for (int n = 0; n < rotationNeeded; ++n) {
            elementBuffer = elements[n];
            elements[n] = elements[arraySize-1-n];
            elements[arraySize-1-n] = elementBuffer;
        }

        System.out.printf("Reversed Array: [");

        isFirstElement = true; //Reset
        for (int temp : elements) {
            if(!isFirstElement) System.out.printf(", ");
            System.out.printf(temp + "");
            isFirstElement = false;
        }
        System.out.printf("]\n");
    }
}