/**
 *  StaffMember.java  
 *  @author: Lewis/Loftus/Smith
 *  Represents a generic staff member.
 */

abstract public class StaffMember
{
   protected String name;
   protected String address;
   protected String phone;

   /**
    *  Sets up a staff member using the specified information.
    *
    *  @param eName 		The name
    *  @param eAddress 		The Address
    *  @param ePhone  		The phone number
    */
  
    public StaffMember (String eName, String eAddress, String ePhone)
    {
       name = eName;
       address = eAddress;
       phone = ePhone;
    }

   /**
    *  Returns a string including the basic employee information.
    *
    *  @return result a String representation of the Staff Member
    */
    
    public String toString()
    {
       String result = "Name: " + name + "\n";

       result += "Address: " + address + "\n";
       result += "Phone: " + phone;

       return result;
    }

   /**
    *  Derived classes must define the pay method for each type of
    *  employee.
    *
    */
    
    public abstract double pay();
}
