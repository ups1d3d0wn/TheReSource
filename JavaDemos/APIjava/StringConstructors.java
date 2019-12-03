/**
* @author Kevin Murphy
* @version 12/3/2019
* Demo use of built in String Constructor.
*/

public class StringConstructors {
     public static void main(String[] args) {
          char[] charArray = {'b', 'i', 'r', 't', 'h', ' ', 'd', 'a', 'y'};
          String s = new String("One way of assigning a String to 's', e.g \nString s = new String()\n");

          String s1 = new String();
          String s2 = new String(s);
          String s3 = new String(charArray);
          String s4 = new String(charArray, 6, 3);

          System.out.printf("s1 = %s%ns2 = %s%ns3 = %s%ns4 = %s%n", s1, s2, s3, s4);


     } // end main method
} // end StringConstructors class
