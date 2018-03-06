
import java.util.*;

/**
 *	IntegerListTest.java Part Four
 *
 *	@author Lewis
 *	@version  11.1.08   3/11/13
 *    
 *	Provide a menu-driven tester for the IntegerList class.
 */

public class IntegerListTest
{
	static IntegerList list = new IntegerList(10);
    static Scanner scan = new Scanner(System.in);

   /**
    * main method - 
    * Create a list, then repeatedly print the menu and do what the
    * user asks until they quit
    */
    
    public static void main(String[] args)
    {
        printMenu();
        int choice = scan.nextInt();
        while (choice != 0)
        {
            dispatch(choice);
            printMenu();
            choice = scan.nextInt();

        }
    }

    /**
     * Do what the menu item calls for
     *
     * @param choice the user's menu choice
     */
    public static void dispatch(int choice)
    {
		int loc, size,oldVal,newVal;
		switch(choice)
		{
		    case 0: 
				System.out.println("Bye!");
				break;
				
				case 1:
				System.out.println("How big should the list be?");
				size = scan.nextInt();
				list = new IntegerList(size);
				list.randomize();
				break;
				
				case 2:
				list.selectionSort();
				break;
				case 3:
				list.sortDecreasing();
				break;

		    case 4:
					System.out.print("Enter the value to look for: ");
					loc = list.search(scan.nextInt());
	
					if (loc != -1) System.out.println("Found at location " + loc);
					else System.out.println("Not in list");
					break;
				
					case 5:
				list.print();
				break;

				case 6:
				case 7:

					System.out.printf("Please enter the value to be replaced: ");
					oldVal = scan.nextInt();					
					System.out.printf("Enter the new value: ");
					newVal = scan.nextInt();
					
					switch(choice) {
					case 6 : 
						list.replaceFirst(oldVal, newVal);
						break;
					
					case 7 : 
						list.replaceAll(oldVal, newVal);
						break;
					default : break;
					}
					
					break;

				case 8:
				case 9:
				case 10:
				case 11:
					System.out.printf("Please enter a value:");
					newVal = scan.nextInt();
					
					switch(choice) {
						case 8 :
							list.addElement(newVal);
							break;
						case 9 :
							list.removeFirst(newVal); 
							break;
						case 10 :
							list.removeAll(newVal);
							break;
						case 11 :
							list.addInOrder(newVal);
							break;
					}
					break;
		    default:
				System.out.println("Sorry, invalid choice");
	      }
    }

   /**
    * Print the user's choices
    */
     
    public static void printMenu()
    {
		System.out.println("\n   Menu   ");
		System.out.println("   ====");
		System.out.println("0: Quit");
		System.out.println("1: Create a new list (** do this first!! **)");
		System.out.println("2: Sort the list using selection sort");
		System.out.println("3: Sort the list using decreasing selection sort");
		System.out.println("4: Find an element in the list using sequential search");
		System.out.println("5: Print the list");
		System.out.println("6: Replace an old value(first occurence)");
		System.out.println("7: Replace an old value(all occurences)");
		System.out.println("8: Add a new element");
		System.out.println("9: remove the first occurance of an element");
		System.out.println("10: remove all occurence of an element");
		System.out.println("11: add an element(In order, use after sorting in a increasing order)");
		System.out.print("\nEnter your choice: ");
    }

}



