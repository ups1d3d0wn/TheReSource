/**
*
*
*
*/

public class Odometer {

     /**
     * The right most digit. This is really the only instance variable we
     * need.  It will authomatically move recursively forward any requests to
     * increment or reset through its associate as needed.
     */

     private Digit onesDigit;

          // constructs new Odometer
          public Odometer(int digits) {
               if(digits < 1) {
                    throw new IllegalArgumentException();
               }

          VirtualDigit d = new NullDigit();
               for(int i = 0; i< digits; i++) {
                    d = new Digit(d);
               }
          // keep a reference to the last digit made
          this.onesDigit = (Digit) d;
          }

     public void increment() {
          this.onesDigit.increment();
     }

     public void reset() {
          this.onesDigit.reset();
     }

     public String toString() {
          return this.onesDigit.toString();
     }

     // example of a main class to run

     public static void main(String[] args) {
          Odometer od = new Odometer(3);
          for(int i = 0; i < 13; i++) {
               od.increment();
          System.out.println(od.toString());
          }
     }


} // end Odometer class
