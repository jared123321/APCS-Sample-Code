/**
 * Dog.java	Lab One
 * @author Lewis/Smith
 * @version 3/29/10
 *
 * A class that holds a dog's name and can make it speak.
 */
 
public class Dog
{
	public String name;	//can be accessed by all subclasses and all classes in the same package

	/**
	* Constructor -- store name
	* @param name the name of the dog
	*/
	public Dog(String name)
	{
		  this.name = name;
	}

	 /**
	  * Returns the dog's name
	  * @return the name of the dog
	  */
	  
	  public String getName()
	  {
		  return name;
	  }
   
	  /**
	  * Returns a string with the dog's comments
	  * @return the dog's comments
	  */

	   public String speak()
	   {
		   return "Woof";
	   }

	   //abstract public int avgBreedWeight();
	   //This does not work
}