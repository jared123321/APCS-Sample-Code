
public abstract class TestQuestion {
    
    protected String question_content;

    public static String charList = "abcdefghijklmnopqrstuvwxyz";

    public TestQuestion(String questionContent) {
        this.question_content = questionContent;
    }
    
    public static void printf(String content) {
        System.out.print(content);
    }

}