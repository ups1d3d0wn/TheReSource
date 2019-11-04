/**
* @author Kevin Murphy
* @version 11/3/2019
*
* Class representing an invisible, empty, or null digit that is the left-most
* digit on the Odometer. NullDigit acts as a sort of base case for our structural
* recursion.
*/

public class NullDigit implements VirtualDigit {

     /**
     * {@inheritDoc}
     * If the NullDigit is incrementing, throw an exception. This is because the
     * neighbors have overflowed (9999->??)
     */

     public void increment() {
          throw new ArithmeticException("Odometer has overflowed");
     }

     /**
     * @{inheritDoc}
     * If the neighbor ot the right has asked us to reset, do not have to do
     * do anything. That meas everyone to my right has reset and the recursion
     * can stop.
     */

     public void reset() {
          // don't do anything
     }

     public String toString() {
          return "";
     }

} // end NullDigit class
