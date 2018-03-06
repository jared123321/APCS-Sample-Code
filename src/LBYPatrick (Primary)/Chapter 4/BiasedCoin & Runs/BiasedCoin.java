/**
 *	Coin.java   (Directions)         
 *	@author Lewis and Loftus
 *	@version 9/27/2007  11/19/13
 *
 *  Represents a coin with two sides that can be flipped.
 */


public class BiasedCoin
{
    public final int HEADS = 0,
                    TAILS = 1;
    
    private int value = 0,
                face = 0;
    private double bias;

    public BiasedCoin (double coinValue, double biasTemp) {
        value = (int)coinValue;
        bias = (biasTemp >= 0 || biasTemp <= 1)? biasTemp : 0.5;
        flip();
    }

    public BiasedCoin () { 
        value = 0;
        bias = 0.5;
        flip();
    }

    public BiasedCoin (double coinValue) {
        value = (int)coinValue;
        bias = 0.5;
        flip();
    }

    /**
     *   Flips the coin by randomly choosing a face.
     */
    final public void flip() {face = (Math.random() * 2) < bias ? HEADS : TAILS;}

    /**
     *  Returns the current face of the coin as an integer.
     *  @return face of the coin as an int
     */
    final public int getFace() {return face;}
    
    /**
     *  compares two coins and determines if they are the same
     *  @param c the other coin
     *  @return boolean value of true or false based on coin value
     */
    final public boolean equals(BiasedCoin c){ return (this.value == c.value);}
    
    /**
     *   Returns the current face of the coin as a string.
     *   @return faceName a String representation of the coin
     */
    final public String toString() {
        
         String faceName = new String();
        
	    //determine if face has a value 0 or 1
        if (face == HEADS)
            faceName = "Heads";
        else
            faceName = "Tails";
        		
        return faceName;
    }
}
