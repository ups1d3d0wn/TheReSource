

import java.math.BigInteger;

public class FactCalc2 {
     // recursive method for factorial
     public static BigInteger factorial(BigInteger number) {
          if(number.compareTo(BigInteger.ONE) <= 0) {
               return BigInteger.ONE;
          } else {
               return number.multiply(factorial(number.subtract(BigInteger.ONE)));
          }
     } // end BigInteger's factorial() method

     // main method that outputs factorials for values 0-20
     public static void main(String[] args) {
          for(int counter = 0; counter<= 50; counter++) {
               System.out.printf("%d! = %d%n", counter, factorial(BigInteger.valueOf(counter)));
          }

     } // end main method

} // end class FactCalc
