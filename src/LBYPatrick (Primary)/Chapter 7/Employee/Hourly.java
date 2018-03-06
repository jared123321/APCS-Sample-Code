/**
 *  Hourly.java (Lab Four)      
 *  @author: Lewis/Loftus/Smith
 *  Represents an employee that gets paid by the hour.
 */

public class Hourly extends Employee
{
   private int hoursWorked;

   /**
    *  Sets up this hourly employee using the specified information.
    *
    *  @param eName 		The name
    *  @param eAddress 		The Address
    *  @param ePhone  		The phone number
    *  @param socSecNumber 	The social security number
    *  @param rate 			The pay rate
    */
    
   public Hourly (String eName, String eAddress, String ePhone,
                  String socSecNumber, double rate)
   {
      super (eName, eAddress, ePhone, socSecNumber, rate);

      hoursWorked = 0;
   }

   /**
    *  Adds the specified number of hours to this employee's
    *  accumulated hours.
    *  
    *  @param moreHours hours to be addded to the total hours worked
    */
    
    public void addHours (int moreHours)
    {
       hoursWorked += moreHours;
    }

   /**
    *  Computes and returns the pay for this hourly employee.
    *
    *  @return payment the pay for this hourly employee
    */
    
    public double pay()
    {
       double payment = payRate * hoursWorked;

       hoursWorked = 0;

       return payment;
    }

   /**
    *  Returns information about this hourly employee as a string.
    *
    *  @return result a String representation of the hourly employee
    */
    
    public String toString()
    {
       String result = super.toString();

       result += "\nCurrent hours: " + hoursWorked;

       return result;
    }
}
