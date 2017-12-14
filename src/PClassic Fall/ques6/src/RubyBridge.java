import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class RubyBridge {
    public static void main(String[] args) throws IOException {
        // Before submitting, make sure the main method hasn't been changed!
        Scanner sc = new Scanner(new FileReader("RubyBridgeIN.txt"));
        while(sc.hasNext()) {
            int n = sc.nextInt();
            String charList = sc.next();
            char[] list = new char[n];
            for(int i = 0; i < n; i++) {
                list[i] = charList.charAt(i);
            }
            System.out.println(rubyBridge(n, list));
        }
        sc.close();
    }
    /* DO NOT MODIFY ABOVE THIS LINE */
    
    public static int rubyBridge(int n, char[] list) {
        /* YOUR CODE HERE */
        int[][] dp = new int[n][n];
        int max = 1;
        for (int i = 1; i < n - 1; i ++){
            if ((dp[i][i + 1] = (list[i] == 'T' ? 1 : -1) + (list[i + 1] == 'T' ? 1 : -1)) == 0) max = 2;
        }
        for (int length = 3; length < n; length += 2){
            for (int i = 0; i < n - length; i ++) {
                if ((dp[i][i+length] = dp[i][i + 1] + dp[i + 2][i + length]) == 0) max = length + 1;
            }
        }

        return max;
    }
}
