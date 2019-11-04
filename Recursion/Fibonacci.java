/**
*
*
*
*
*/


public class Fibonacci {

     // keep record of how many calls to fibonacci() we make
     private static int calls = 0;

     /**
     *
     * @param n The index to compute
     * @return The nth fibonacci number
     */

     public static void main(String[] args) {
          System.out.println(fibonacci(10));
          System.out.println("It took " + calls + " calls to fibonacci.");
     } // end main class


     public static int fibonacci(int n) {
          calls++;

          if(n < 0) {
               throw new IllegalArgumentException();
          }
          if(n == 0) {
               // first base case
               return 0;
          }
          if(n == 1) {
               // second base case
               return 1;
          }
          return fibonacci(n - 1) + fibonacci(n - 2);

     } // end of fibonacci() method

} // end Fibonacci class
