/**
 *  Volunteer.java (Lab Four)
 *  @author: Lewis/Loftus/Smith
 *  Represents a staff member that works as a volunteer.
 */

public class Volunteer extends StaffMember
{
   /**
    *  Sets up a volunteer using the specified information.
    *  @param eName 		The name
    *  @param eAddress 		The Address
    *  @param ePhone  		The phone number
    */
    
    public Volunteer (String eName, String eAddress, String ePhone)
    {
       super (eName, eAddress, ePhone);
    }

   /**
    *  Returns a zero pay value for this volunteer.
    *  @return zero pay
    */
    
    public double pay()
    {
       return 0.0;
    }
}
