/**
 *  Firm.java (Lab Four)      
 *  @author: Lewis/Loftus/Smith
 *  Demonstrates polymorphism via inheritance.
 */

public class Firm
{
   /**
    *  Creates a staff of employees for a firm and pays them.
    * @param args
    */
  
   public static void main (String[] args)
   {
      Staff personnel = new Staff();

      personnel.payday();
   }
   
}
