/**
 * IntList.java
 * @author Lewis/Smith
 * @version Lab Two
 * An (unsorted) integer list class with a method to add an 
 * integer to the list and a toString method that returns the contents
 * of the list with indices.
 *        
 */
public class IntList
{

    protected int[] list;
    protected int numElements =0;

    /**
     * Constructor -- creates an integer list of a given size.
     *
     * @param size the size of the list
     */
     
     public IntList(int size)
     {
		 list = new int[size];
     }


    /**
     * Adds an integer to the list.  If the list is full,
     * prints a message and does nothing.
     *
     * @param value the value to add to the list 
     */
     
    public void add(int value)
    {
        //
		 if (numElements == list.length)
		 {
		     System.out.println("Can't add, list is full");
		 }
		 else
		{
			 list[numElements] = value;
			 numElements++;
		}
     }

    /**
     * Returns a string containing the elements of the list with their
     * indices.
     *
     * @return returnString a String representation of the list
     */
     
     public String toString()
     {
		 String returnString = "";
         //
		 for (int i=0; i<numElements; i++)
		 {
	        	returnString += i + ": " + list[i] + "\n";
	     }
		 return returnString;
     }
}


