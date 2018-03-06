/**
 *  Person.java (Directions)
 *  Code Description: A simple class representing a person.
 *  @author ppatel/lewis
 *  @version 10/15/08
 */

public class Person
{
    //instance data member of class	
    private String name;
    private int age;

    /**
     *  Sets up a Person object with the given name and age.
     *  @param name used to intialize name
     *	@param age used to intialize age
     */
    public Person (String name, int age)
    {
    	this.name = name;
    	this.age = age;
    }

    /**
     *  Changes the name of the Person to the parameter newName.
     *  @param newName used to update name
     */
    public void changeName(String newName)
    {
    	name = newName;
    }

    /**
     *  Changes the age of the Person to the parameter newAge.
     *  @param newAge used to update the age
     */
    public void changeAge (int newAge)
    {
    	age = newAge;
    }

    /**
     *  Returns the person's name and age as a string.
     *  @retrun info string representing all info in a string format
     */
    public String toString()
    {
        String info = new String ();
        
        info = name + " - Age " + age;
        
    	return info;
    }
}