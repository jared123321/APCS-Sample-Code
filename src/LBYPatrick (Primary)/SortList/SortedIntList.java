import java.util.Arrays;

public class SortedIntList extends IntList {

    public SortedIntList(int size)
    {
        super(size);
    }

    @Override
    public String toString() {
        
        int [] sorted_list = new int[numElements];

        for(int i = 0; i < numElements; ++i) {
            sorted_list[i] = list[i];
        }

        Arrays.sort(sorted_list);

        String returnString = "";
         //
		 for (int i=0; i<numElements; i++)
		 {
	        	returnString += i + ": " + sorted_list[i] + "\n";
	     }
		 return returnString;
    };
}

