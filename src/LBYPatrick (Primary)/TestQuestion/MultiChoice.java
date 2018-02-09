
import java.util.ArrayList;

public class MultiChoice extends TestQuestion {

    private ArrayList<String> choices;

    public MultiChoice(String question, ArrayList<String> choiceList) {
        super(question);
        this.choices = choiceList;
    }
    
    public String toString() {
            String return_buffer = new String(); 

            return_buffer += "\n" + this.question_content + "\n";
           
            for(int i = 0; i < this.choices.size(); ++i) {
               return_buffer += "\t" + charList.charAt(i) + ". " + this.choices.get(i) + "\n";
           }

           return return_buffer;
    }
}