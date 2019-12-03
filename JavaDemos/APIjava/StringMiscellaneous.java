
/**
* @author Kevin Murphy
* @version 12/03/2019
*
* Demonstrates the length, charAt, and getChars
* methods of the String class
*/

public class StringMiscellaneous {
     public static void main(String[] args) {
          String s1 = "h3 770: 0LL3h";
          char[] charArray = new char[13];
          System.out.printf("s1: %s", s1);

          // length method
          System.out.printf("%nLength of s1: %d", s1.length());

          System.out.printf("%nThe String reversed is:\n ");

          for(int count = s1.length() - 1; count >=0; count--) {
               System.out.printf("%c ", s1.charAt(count));
          } // end of first counter controlled for loop

          s1.getChars(0, 13, charArray, 0);
          System.out.printf("%nThe character array is:\n   ");

          for(char character : charArray) {
               System.out.print(character);
          } // end of enhanced for loop

          System.out.println();
     } // end main method
} // end StringMiscellaneous class
