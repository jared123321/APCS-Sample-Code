
import java.util.Scanner;
import java.util.ArrayList;

public class WriteTest {

    public static void printf(String content) {
        TestQuestion.printf(content);
    }
    public static void main(String [] args) {

        int num_questions;
        String type;
        int int_input_buffer;
        String string_input_buffer;
        Essay temp_essay;
        ArrayList<TestQuestion> question_list = new ArrayList<>();

        Scanner scan = new Scanner(System.in);


        num_questions = scan.nextInt();

        for(int i = 0; i < num_questions; ++i) {
            
            boolean isEssay = false; 

            ArrayList<String> temp_choices_list = new ArrayList<>();

            type = scan.next();
            isEssay = type.compareTo("e") == 0;
            scan.nextLine(); //Clean up

            //printf(isEssay ? "True" : "False");
            if(isEssay) {

                int_input_buffer = scan.nextInt();

                scan.nextLine(); //Clean up
                string_input_buffer = scan.nextLine();

                question_list.add(new Essay(string_input_buffer,int_input_buffer));
                continue;
            }
            else if(!isEssay) {

                int_input_buffer = scan.nextInt();

                scan.nextLine(); //Clean up
                string_input_buffer = scan.nextLine();

                for (int n = 0; n < int_input_buffer; ++n) {

                    String choice_buffer = scan.nextLine();
                    temp_choices_list.add(choice_buffer);
                }
                question_list.add(new MultiChoice(string_input_buffer, temp_choices_list));
                continue;
            }
        }
        for(TestQuestion temp_question : question_list) {
            TestQuestion.printf(temp_question.toString());
        }
    }

}