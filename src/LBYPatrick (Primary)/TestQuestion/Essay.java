public class Essay extends TestQuestion {
    
    private int num_blank_lines;

    public Essay(String question, int blankLines) {
        super(question);
        this.num_blank_lines = blankLines;
    }

    public String toString() {

        String return_buffer = new String();
    
        return_buffer += this.question_content + "\n";

        for(int i = 0; i < num_blank_lines; ++i) {
            return_buffer += "\n";
        }

        return return_buffer;
    }
}