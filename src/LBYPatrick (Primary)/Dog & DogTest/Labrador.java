/**
 * Labrador.java	Lab One
 * @author Lewis/Smith
 * @version 3/29/10
 * A class derived from Dog that holds information about
 * a labrador retriever.  Overrides Dog speak method and includes
 * information about avg weight for this breed.
 *          
 */

public class Labrador extends Dog
{
  	private String color; //black, yellow, or chocolate?
	private int breedWeight = 75;

	/**
	 * Constructor -- store name
	 * @param name the name of the dog
	 * @param color the color of the dog
	 */

	  public Labrador(String name,  String color)
	  {
          super(name);
		  this.color = color;
	  }

	 /**
	  * Big bark -- overrides speak method in Dog
	  * @return the dog's comments
	  */
	  
	  public String speak()
	  {
        
		return "WOOF";
	  }

	 /**
	  * Returns weight
	  * @return the weight of the dog
	  */
	  public int avgBreedWeight()
	  {
		  return this.breedWeight;
	  }

}
