public class TestNames {
    public static void main(String [] args) { 
        Name obj = new Name ("John", "F.", "Kennedy");
        Name obj2 = new Name ("Ludwig","van","Beethoven");

        System.out.print("Person 1:\n\n");
        System.out.print("\t" +   "firstMiddleLast: " + obj.firstMiddleLast());
        System.out.print("\n\t" + "LastFirstMiddle: " + obj.lastFirstMiddle());
        System.out.print("\n\t" + "initials:        " + obj.initials());
        System.out.print("\n\t" + "length:          " + obj.length());
        System.out.print("\n\n");

        System.out.print("Person 2:\n\n");
        System.out.print("\t" +   "firstMiddleLast: " + obj2.firstMiddleLast());
        System.out.print("\n\t" + "LastFirstMiddle: " + obj2.lastFirstMiddle());
        System.out.print("\n\t" + "initials:        " + obj2.initials());
        System.out.print("\n\t" + "length:          " + obj2.length());
        System.out.print("\n\n");
    }
}