/**
 *  Item.java (Part Seven)
 *  @author Lewis/Smith
 *  @version 11.05.08
 *
 *   Represents an item in a shopping cart.
 */

import java.text.NumberFormat;

public class Item
{
	private String name;
	private double price;
	private int quantity;

	/**
	 *  Create a new item with the given attributes.
	 *
	 * @param itemName the name of the item
	 * @param itemPrice the item's price
	 * @param numPurchased the number purchased
	 */
	public Item (String itemName, double itemPrice, int numPurchased)
	{
		name = new String(itemName);
		price = itemPrice;
		quantity = numPurchased;
	}

	/**
	 *   Will return the price of the item
	 *   @return price the unit price as a double
	 */
	public double getPrice()
	{
		return price;
	}

	/**
	 *   Will return the name of the item
	 *	 @return name the name of the item
	 */
	public String getName()
	{
		return name;
	}

	/**
	 *  Will return the number of items
	 *	@return quantity the quantity of the item
	 */
	 public int getQuantity()
	{
		return quantity;
	}
	
	/**
	 *  Return a string value representing information about the item
	 *	@return info a string with the information about the item
	 */
	public String toString ()
	{
        String info = new String();
        
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
		info = (name + "\t\t" + fmt.format(price) + "\t\t" + quantity + "\t"
				+ fmt.format(price*quantity));
		
        return info;
	}
}  

