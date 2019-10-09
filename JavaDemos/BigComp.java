/**
*@author Kevin Murphy
*@version 10/02/19
*
*/
import java.util.*;

public class BigComp {

  public static void main(String[] args) {
    // String s1 = "badd";
    // String s2 = "bad";
    ArrayList<String> str = new ArrayList<String>();
    str.add("ABc");
    str.add("AbC");
    str.add("bac");
    System.out.println(findMinimum(str));
  }

  public static int compareTo(String s1, String s2) {

    if(s1.charAt(0) < s2.charAt(0)) {
      return -1; // String s1 is alphabetically before s2
    }
    if(s1.charAt(0) > s2.charAt(0)) {
      return 1; // String s1 is alphabetically after s2
    }
    if(s1.charAt(0) == s2.charAt(0)) {
      if(s1.length()== 1 && s2.length() ==1) {
          return 0; // both strings being compared are identical
      }
      if(s1.length() == 1 && s2.length() > 1) {
          return -1; // s1 is before s2
      }
      if(s1.length() > 1 && s2.length()== 1) {
          return 1; // s2 is before s1
      }
    }
    return compareTo(s1.substring(1), s2.substring(1));

  } // end of compareTo method

  public static String findMinimum(ArrayList<String> stringArray) {
    //     valueOf(char[] data)()
    String s1 = stringArray.get(0);
    int max = stringArray.size()-1;
    String s2 = stringArray.get(max);
    int temp = compareTo(s1, s2);
    if(stringArray.size() == 1) {
        return stringArray.get(0);
    }

    if(temp == 0) {
      stringArray.remove(max);
      return findMinimum(stringArray);
    }
    else if(temp == 1) {
      stringArray.remove(s1);
      return findMinimum(stringArray);
    }
    else {
      stringArray.remove(s2);
      return findMinimum(stringArray);
    }
  } // end findMinimum method
} // end of BigComp class
