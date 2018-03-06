/**
 *  Executive.java (Lab Four)
 *  @author: Lewis/Loftus/Smith
 *  Represents an executive staff member, who can earn a bonus.
 */

public class Executive extends Employee
{
   private double bonus;

   /**
    *  Sets up an executive with the specified information.
    *
    *  @param eName 		The name
    *  @param eAddress 		The Address
    *  @param ePhone  		The phone number
    *  @param socSecNumber 	The social security number
    *  @param rate 			The pay rate
    */
    
    public Executive (String eName, String eAddress, String ePhone,
                      String socSecNumber, double rate)
    {
       super (eName, eAddress, ePhone, socSecNumber, rate);

       bonus = 0;  // bonus has yet to be awarded
    }

   /**
    *  Awards the specified bonus to this executive.
    *
    *  @param execBonus the amout of the bonus
    */
   
    public void awardBonus (double execBonus)
    {
       bonus = execBonus;
    }

   /**
    *  Computes and returns the pay for an executive, which is the
    *  regular employee payment plus a one-time bonus.
    *
    *  @return payment the pay for the executive
    */
    
   public double pay()
   {
      double payment = super.pay() + bonus;

      bonus = 0;

      return payment;
   }
}
