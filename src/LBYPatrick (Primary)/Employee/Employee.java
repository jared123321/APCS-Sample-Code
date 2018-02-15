/**
 *  Employee.java (Lab Four)      
 *  @author: Lewis/Loftus/Smith
 * Represents a general paid employee.
 */

public class Employee extends StaffMember
{
   protected String socialSecurityNumber;
   protected double payRate;
   
   /**
    *  Constructor - Sets up an employee with the specified information.
    *
    *  @param eName 		The name
    *  @param eAddress 		The Address
    *  @param ePhone  		The phone number
    *  @param socSecNumber 	The social security number
    *  @param rate 			The pay rate
    *
    */
    
   public Employee (String eName, String eAddress, String ePhone,
                    String socSecNumber, double rate)
   {
      super (eName, eAddress, ePhone);

      socialSecurityNumber = socSecNumber;
      payRate = rate;
   }

   /**
    *
    *  @return payRate the pay rate of the employee
    */
    public double pay()
    {
       return payRate;
    }
    
    /**
     *
     *  @return results a String reprsentation of the employee
     */    
    public String toString()
    {
        String result = super.toString();
        
        result += "\nSocial Security Number: " + socialSecurityNumber;
        
        return result;
    }
}
