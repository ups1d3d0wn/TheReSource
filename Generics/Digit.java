/**
*
*
*
*/

public class Digit implements VirtualDigit {

     private int value;

     private VirtualDigit associate;


     public Digit(final VirtualDigit associate) {
          this.associate = associate;
          this.value = 0;
     }

     public void increment() {
          this.value = (this.value + 1) % 10;

          if(this.value == 0) {
               this.associate.increment();
          }
          // otherwise we are at basecase of sorts. Did not overflow so we do {
          // not have to do anything else
     } // end increment() mehtod

     public void reset() {
          this.value = 0;
          this.associate.reset();

     } // end reset() method

     /**
     * Returns the String that represents this digit as well as the ones to the
     * left.
     */

     public String toString() {
          // recursively calls toString() on our neighbor
          return this.associate.toString() + Integer.toString(this.value);
     } // end toString() method

} // end Digit class
