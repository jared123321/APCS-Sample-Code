/**
 * DogTest.java	Lab One
 * @author Lewis/Smith
 * @version 3/29/10
 *
 * A simple test class that creates a Dog and makes it speak.
 */

import java.util.ArrayList;

public class DogTest
{
	/**
	 * main method
	 * @param args
	 */
	public static void main(String[] args)
	{
		Dog dog = new Dog("Spike");
		Yorkshire dog2 = new Yorkshire("Patel");
		Labrador  dog3 = new Labrador("Mariani","Gold");
		
		System.out.println(dog.getName() + " says " + dog.speak());
		System.out.println(dog2.getName() + " says "+ dog2.speak() + "\t\taverage breed weight: " + dog2.avgBreedWeight());
		System.out.println(dog3.getName() + " says " + dog3.speak() + "\taverage breed weight: " + dog3.avgBreedWeight());
	}
    
    
}
