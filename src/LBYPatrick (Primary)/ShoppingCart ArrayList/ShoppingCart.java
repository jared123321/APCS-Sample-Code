/**
 *  ShoppingCart.java (Part Seven)
 *  @author Lewis
 *  @version 2.04.10
 *
 *  Represents a shopping cart as an array of items
 *
 */

import java.text.NumberFormat;
import java.util.ArrayList;

public class ShoppingCart
{
		 private int itemCount;      // total number of items in the cart
		 public  double totalPrice;  // total price of items in the cart
		 private int capacity;       // current cart capacity
		 private ArrayList<Item> cart; 

	/**
	 *  Creates an empty shopping cart with a capacity of 5 items.
	 */

	private static String getTabs(int count) {
		String outputBuffer = "";
		for(int i = 0; i < count; ++i) {
			outputBuffer += "   ";
		}
		return outputBuffer;
	}
	
	public ShoppingCart()
	{
		this.capacity = 5;
		this.itemCount = 0;
		this.totalPrice = 0.0;
		this.cart = new ArrayList<>();
	}

	/**
	 *  Adds an item to the shopping cart.
	 *
	 *  @param itemName	The name of the item
	 *  @param price		The price of the item
	 *  @param quantity  The number of the item to add to cart
	 */
	public void addToCart(String itemName, double price, int quantity)
	{
		this.cart.add(new Item(itemName,price,quantity));
		this.totalPrice += price*quantity;
		this.itemCount++;
	}

	/**
	 *  Increases the capacity of the shopping cart by 3
	 */
	private void increaseSize()
	{
		//Do nothing...
	}
	/**
	 *  Returns the contents of the cart together with
	 *  summary information.
	 *
	 *  @return contents a String representation of the cart
	 */
	public String toString()
	{
                
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
		
		String contents = "\nShopping Cart\n";
		String lineBuffer   = "";
		final int NAME_BAR_LENGTH = 16;
		final int UP_BAR_LENGTH  = 22;
		final int QT_BAR_LENGTH  = 11;
		contents += "\nItem"+getTabs(4)+"Unit Price"+ getTabs(4)+"Quantity"+getTabs(1)+"Total\n";
		
		for (int i = 0; i < itemCount; i++) {
			lineBuffer = "";
			lineBuffer += this.cart.get(i).getName();
			for(int n = 0; n < (NAME_BAR_LENGTH - this.cart.get(i).getName().length()); ++n) {
				lineBuffer += " ";
			}
			lineBuffer += fmt.format(this.cart.get(i).getPrice());
			for(int r = 0; r < (UP_BAR_LENGTH - fmt.format(this.cart.get(i).getPrice()).length());++r) {
				lineBuffer += " ";
			}
			lineBuffer += this.cart.get(i).getQuantity();
			for (int a = 0; a < (QT_BAR_LENGTH-Integer.toString(this.cart.get(i).getQuantity()).length()); ++a) {
				lineBuffer += " ";
			}
			lineBuffer += fmt.format(this.cart.get(i).getPrice() * this.cart.get(i).getQuantity());
			lineBuffer += "\n";

			contents += lineBuffer;
		}
		contents += "\nTotal Price: " + fmt.format(totalPrice);
		contents += "\n";
		
		return contents;
	}
	
}

