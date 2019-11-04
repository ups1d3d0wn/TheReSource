
import java.util.*;

public class PrintArray {

     public static String printArray(int[] array, int x) {


          if(x < array.length) {
               return String.format("%s%d ", printArray(array, x + 1), array[x]);
          }
          else {
          return "";
          }

     } // end of printArray() method


     public static void main(String[] args) {
          int[] numbers = {2,5,3,22,3,44,5,9,83};

          String result = printArray(numbers, 0);
          System.out.printf(result);
     }



} // end class PrintArray
