/**
* @author Kevin Murphy
* @version 11/3/2019
*
* Practice using recursion in java programming.
*
* Top: An interface that will act as a superclass for the classes Digit and NullDigit
*/

public interface VirtualDigit {

     /**
     * Increments the digit's value, possibly rolling over and "asking" it's
     * associate to increment.
     */

     public void increment();

     /**
     * Resets the digit value to 0 and propogates the reset request to it's
     * associate.
     */
     public void reset();

} // end VirtualDigit class
