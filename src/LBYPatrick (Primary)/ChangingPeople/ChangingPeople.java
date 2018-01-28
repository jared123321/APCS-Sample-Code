/**
 *  ChangingPeople.java (Directions)
 *  Code Description: Demonstrates parameter passing -- contains a method that should
 *  change two Person objects.
 *  @author ppatel/Lewis
 *  @version 10/15/08    11/8/10
 */

public class ChangingPeople
{
	/**
	 *  Switching names of people.
	 *   @param pOne change the first actual parameter to "Jack - Age 101" 
	 *   @param pTwo change reference to age and name given in 
	 *                            the third and fourth parameter
	 */ 
    public static void changePeople (Person pOne, Person pTwo, int age, String name)
	{
		System.out.println ("\nInside changePeople... Original parameters...");
		System.out.println ("person one: " + pOne);
		System.out.println ("person two: " + pTwo);
		System.out.println ("age: " + age + "\tname: " + name + "\n");
		
		// Make changes
		pTwo.changeName(name);
		pTwo.changeAge(age);

		name = "Jack";
		age = 101;
		pOne.changeName (name);
		pOne.changeAge (age);
		
		// Print changes
		System.out.println ("\nInside changePeople... Changed values...");
		System.out.println ("person one: " + pOne);
		System.out.println ("person two: " + pTwo);
		System.out.println ("age: " + age + "\tname: " + name + "\n");
	}

    /**
     * Sets up two person objects, one integer, and one String
     * object.  These are sent to a method that should make
     * some changes.
     * @param args
     */
    public static void main (String[] args)
    {
        Person personOne = new Person ("Sally", 13);
        Person personTwo = new Person ("Sam", 15);

        int age = 21;
        String name = new String("Jill");

        System.out.println ("\nParameter Passing... Original values...");
        System.out.println ("person one: " + personOne);
        System.out.println ("person two: " + personTwo);
        System.out.println ("age: " + age + "\tname: " + name + "\n");

        changePeople (personOne, personTwo, age, name);

        System.out.println ("\nValues after calling changePeople...");
        System.out.println ("person one: " + personOne);
        System.out.println ("person Two: " + personTwo);
        System.out.println ("age: " + age + "\t\tname: " + name + "\n");

    }
}
