import java.util.*;

final public class Name {
    
    private String firstName = "";
    private String middleName = "";
    private String lastName = "";
    
    public Name (String first, String middle, String last) {
        firstName = first;
        middleName = middle;
        lastName = last;
    }

    final public String getFirst() {return this.firstName;}
    final public String getMiddle() {return this.middleName;}
    final public String getLast() {return this.lastName;}

    final public String  firstMiddleLast() {return this.firstName + " " + this.middleName + " " + this.lastName;}
    final public String  lastFirstMiddle() {return this.lastName + ", " + this.firstName + " " + this.middleName;}
    final public boolean equals(Name otherName) {return this.firstMiddleLast() == otherName.firstMiddleLast(); }
    final public int     length() {return this.firstName.length() + this.middleName.length() + this.lastName.length();}
    final public String  initials() {return this.firstName.substring(0,1).toUpperCase() + this.middleName.substring(0,1).toUpperCase() + this.lastName.substring(0,1).toUpperCase();}
}