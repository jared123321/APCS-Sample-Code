import java.util.Scanner;
import java.text.NumberFormat;

public class ShoppingCartTest {
    
    final private static void printf(String message) {
        System.out.print(message);    
    }

    public static void main(String [] args) {
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        Scanner scan = new Scanner(System.in);
        ShoppingCart cart = new ShoppingCart();
        String userInput = new String();
        String name      = new String();
        double price     = 0.0;
        int    quantity  = 0;

        while(true) {
            
            printf("\n==================\n");
            printf(cart.toString());
            printf("\n==================\n\n");
            
            printf("\nItem Name:");
            userInput = new String();
            userInput = scan.next();
            if(userInput.toUpperCase().compareTo("STOP") == 0) break;
            else {
                name = userInput;
                userInput = new String();
            }


            printf("\nPrice:");
            userInput = scan.next();
            if(userInput.toUpperCase().compareTo("STOP") == 0) break;
            else {
                price = Double.parseDouble(userInput);
                userInput = new String();
            }


            printf("\nQuantity:");
            userInput = scan.next();
            if(userInput.toUpperCase().compareTo("STOP") == 0) break;
            else {
                quantity = Integer.parseInt(userInput);
                userInput = new String();
            }

            cart.addToCart(name, price, quantity);
        }
        printf("Please pay: " + fmt.format(cart.totalPrice));
    }
}

