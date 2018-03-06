/**
 * Yorkshire.java	Lab One
 * @author Lewis/Smith
 * @version 3/29/10
 * A class derived from Dog that holds information about
 * a Yorkshire terrier. Overrides Dog speak method.
 */

public class Yorkshire extends Dog
{
    private int breedWeight = 130;
    /**
     * Constructor -- store name
     * @param name the name of the dog
     */ 
     public Yorkshire(String name)
     {
	    super(name);
     }

    /**
     * small bark -- overrides speak method in Dog
     * @return the dog's comments
     */
      
     public String speak()
     {
	    return "woof";
     }

     public int avgBreedWeight()
     {
         return this.breedWeight;
     }
}
