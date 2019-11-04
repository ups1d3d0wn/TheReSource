import java.util.*;


public class ListTest {

     public static void main(String[] args) {
          // set up list1
          String[] colors = {"black", "yellow", "green", "blue", "violet", "silver"};
          List<String> list1 = new LinkedList<>();
           for(String color: colors) {
                list1.add(color);
           }

           // set up list2
           String[] colors2 = {"gold", "white", "brown", "blue", "gray", "silver"};
           List<String> list2 = new LinkedList<>();
           for(String color: colors2) {
                list2.add(color);
           }

           list1.addAll(list2);
           list2 = null;
           printList(list1);

           convertToUppercaseString(list1);
           printList(list1);

           System.out.println("Deleting elements 4 to 6...");
           removeItems(list1, 4, 7);
           printList(list1);
           printReversedList(list1);

          // removeAll(list1);
          removeAll(list1);
          System.out.println("Removing all elements from list1 <><><><><> ");
          printList(list1);

     } // end main

     private static void printList(List<String> list) {
          System.out.println("list:");
          for(String color: list) {
               System.out.printf("%s ", color);
          }
          System.out.println();
     } // end printList() method

     private static void convertToUppercaseString(List<String> list) {
          ListIterator<String> iterator = list.listIterator();
          while(iterator.hasNext()) {
               String color = iterator.next();
               iterator.set(color.toUpperCase());
          }
     } // end convertToUppercaseString() method

     private static void removeItems(List<String> list, int start, int end) {
          list.subList(start, end).clear();
     }

     private static void removeAll(List<String> list) {
          list.removeAll(list);
     }

     private static void printReversedList(List<String>list) {
          ListIterator<String> iterator = list.listIterator(list.size());
          System.out.println("Reversing list: ");
          while(iterator.hasPrevious()) {
               System.out.printf("%s ", iterator.previous());
          }
     } // end printReversedList() method

} // end LinkedList class
