
/**
 *	IntegerList.java	Part Four
 * @author Lewis
 * @version  11.1.08
 *
 * Define an IntegerList class with methods to create, fill,
 * sort, and search in a list of integers.
 *          
 */

public class IntegerList
{

   private int[] list; //values in the list
   private int elementCount = 0;
    /**
     * @param size the size of the array
     *
     * Create a list of the given size
     */
     
   	 public IntegerList(int size)
     {
		this.list = new int[size];
		this.elementCount = size;
     }


    /**
     * fill array with integers between 1 and 100, inclusive
     *
     */
     
     public void randomize()
     {
		 //randomly populate the array
		 for (int i=0; i<list.length; i++)
			 list[i] = (int)(Math.random() * 100) + 1;
     }


    /**
     * print array elements with indices
     *
     */
     
     public void print()
     {
		 //print elements of the array
		 for (int i=0; i<elementCount; i++)
		 {
			 System.out.println(i + ":\t" + list[i]);

		 }
     }


    /**
     * returns the index of the first occurrence of target in the list.
     * returns -1 if target does not appear in the list
     *
     * @return location the index of the first occurrence of target in the list.
     */
 
    public int search(int target)
    {
		int location = -1;
		//Treverse the array looking for "target"
		for (int i=0; i<list.length && -1 == location; i++)
		{
			//checks if index i element is the same as target
			if (list[i] == target)
			{
				location = i;
			}
				
		}
		return location;
    }


    /**
     * Sorts the list into ascending order using the selection sort algorithm
     *
     */
    public void selectionSort()
    {
		int minIndex;
		//outter loop control the location of array upto the sorted element
		for (int i=0; i < list.length-1; i++)
		{
			//find smallest element in list starting at location i
			minIndex = i;
			for (int j = i+1; j < list.length; j++)
			{
				//checks for new min value and updates minIndex
				if (list[j] < list[minIndex])
				{
					minIndex = j;

				}
			}

			//swap list[i] with smallest element
			int temp = list[i];
			list[i] = list[minIndex];
			list[minIndex] = temp;
	    }
    }

	public void sortDecreasing() {
		this.selectionSort();
		int [] postList = new int[this.list.length];
		
		for(int n = this.list.length-1; n >= 0; --n) {
			postList[n] = this.list[(this.list.length-1)-n];
		}

		this.list = postList;
	}

	public void replaceAll(int oldVal, int newVal) {

		for(int n = 0; n < this.list.length; ++n) {
				if(this.list[n] == oldVal) {
					this.list[n] = newVal;
			}
		}
	}

	public void replaceFirst(int oldVal, int newVal) {
		
		int index = this.search(oldVal);
		
		if(index != -1) {
			 list[index] = newVal;
		}
	}

	public void increaseSize() {
		int [] newList = new int[(this.list.length + 1)*2];

		for(int i = 0; i < this.elementCount; ++i) {
			newList[i] = this.list[i];
		}

		this.list = newList;
	}

	public void addElement(int newVal) {

		if(this.elementCount == this.list.length) increaseSize();

		this.list[this.elementCount] = newVal;
		this.elementCount ++;
		
	}

	public void removeFirst(int newVal) {
		
		for (int i = 0; i < elementCount; ++i) {
			if (this.list[i] == newVal) {
				elementCount --;
				for (int n = i; n < elementCount; ++n) {
					this.list[n] = this.list[n+1];
				}
				break;
			}
		}
	}

	public void removeAll(int newVal) {
		for(int i = 0; i < elementCount; ++i) {
			if(this.list[i] == newVal) {
				elementCount--;
				for(int n = i; n < elementCount; ++n) {this.list[i] = this.list[i+1];}
			}
		}
	}
	
	public void addInOrder(int newVal) {

		if(this.elementCount == this.list.length) increaseSize();

		for(int i = 0; i < this.elementCount; ++i) {
			if (newVal < this.list[i]) {

				for(int n = elementCount; n > i; --n) {
					this.list[n] = this.list[n-1];
				}
				
				this.list[i] = newVal;
				this.elementCount ++;
				return;
			}
		}
		this.list[elementCount] = newVal;
		this.elementCount ++;
	}
}



