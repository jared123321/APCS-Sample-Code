

public class StudentGrades {
   
    public static final int bannerLength = 30;

    public static void outputStudentInfo(String name, String lab, String bonus, String total) {
        System.out.println(name + "\t\t\t" + lab + "\t\t" + bonus + "\t\t" + total); //String Concatenation HERE


    }

    public static void outputBanner(String charOne, String charTwo) {
        for(int i = 0; i < bannerLength; i++) {
            if (i < (bannerLength / 2)) System.out.print(charOne);
            else System.out.print(charTwo);
        }
        System.out.println();
    }

    public static void main(String [] args) {
        
        outputBanner("/","\\");
        System.out.println("==     " + "Student Points" + "      ==");
        outputBanner("\\","/");
        
        outputStudentInfo("Name", "Lab", "Bonus", "Total");
        outputStudentInfo("--", "--","--","--");
        outputStudentInfo("Joe","43","7","50");
        outputStudentInfo("William","50","8","58");
        outputStudentInfo("MarySue","39","10","49");
        outputStudentInfo("Jimmy","50","10","60");
        outputStudentInfo("Husky","90","10","100");

    }

}