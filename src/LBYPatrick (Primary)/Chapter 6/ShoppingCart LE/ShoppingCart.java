/**
 *  ShoppingCart.java (Part Seven)
 *  @author Lewis
 *  @version 2.04.10
 *
 *  Represents a shopping cart as an array of items
 *
 */

import java.text.NumberFormat;

public class ShoppingCart
{
	final public static int CART_MAX = 1024;
		 private int itemCount;      // total number of items in the cart
		 public  double totalPrice;  // total price of items in the cart
		 private int capacity;       // current cart capacity
		 private Item [] cart; 

	/**
	 *  Creates an empty shopping cart with a capacity of 5 items.
	 */
	public ShoppingCart()
	{
		this.capacity = 5;
		this.itemCount = 0;
		this.totalPrice = 0.0;
		this.cart = new Item[CART_MAX];
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
		increaseSize();
		this.cart[itemCount] = new Item(itemName,price,quantity);
		this.totalPrice += price*quantity;
		this.itemCount++;
	}

	/**
	 *  Increases the capacity of the shopping cart by 3
	 */
	private void increaseSize()
	{
		if(itemCount >= this.cart.length) {
			Item [] temp = new Item[this.cart.length * 2];
			for(int i = 0; i < itemCount; ++i) {temp[i] = this.cart[i];}
			this.cart = temp;
		}
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
		contents += "\nItem\t\tUnit Price\tQuantity\tTotal\n";
		
		for (int i = 0; i < itemCount; i++)
			contents += cart[i].toString() + "\n";
		
		contents += "\nTotal Price: " + fmt.format(totalPrice);
		contents += "\n";
		
		return contents;
	}
	
}

