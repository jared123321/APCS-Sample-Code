
import java.util.Scanner;

public class Palindromes {

    /**
     * The core method of this assignment
     * @param rawText the original text for examination
     * @return whether the rawText is a Palindrome
     */
    static boolean isPalindrome(String rawText) {    
        
        /*
         *  Make constant static local variables for faster computing
         *  A trick learned from LeetCode LOL
         */
        final int loopRequired = (rawText.length() - (rawText.length() %2)) / 2;
        final int stringMaxIndex = rawText.length() - 1;

        if(stringMaxIndex < 1) return true;
        else {
            for(int i = 0; i < loopRequired; ++i) { //Yes this is not recursive because it would be slower than this, like much slower
                if(rawText.charAt(i) != rawText.charAt(stringMaxIndex - i)) return false;
            }
            return true;
        }
    }

    /**
     * Praise the glorious printf!
     */
    static void printf(String message) {
        System.out.printf(message);
    }

    public static void main(String [] args) {
        
        String inputBuffer;
        Scanner scan = new Scanner(System.in);

        printf("Please enter a string to see if it is a palindrome: ");
        inputBuffer = scan.nextLine();

        printf("Is this string a palindrome?: " + (isPalindrome(inputBuffer)? "YES" : "NO"));

    }
}