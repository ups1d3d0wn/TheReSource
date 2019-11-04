public class FactCalc {
     // recursive method for factorial
     public static long factorial(long number) {
          if(number <= 1) {
               return 1;
          } else {
               return number * factorial(number - 1);
          }
     } // end factorial() method

     // main method that outputs factorials for values 0-20
     public static void main(String[] args) {
          for(int counter = 0; counter <= 20; counter++) {
               System.out.printf("%d! = %d%n", counter, factorial(counter));
          }

     } // end main method

} // end class FactCalc
