/**
* Sentinel-Controlled w/ ClassAverage example
* Uses Scanner class to take in input from terminal.
* @author Kevin Murphy
* @version 11/11/2019
*/

import java.util.Scanner;

public class SentinelGrader {

     public static void main(String[] args) {

          Scanner input = new Scanner(System.in);

          int total = 0;
          int gradeCounter = 0;

          System.out.println("Enter grade or enter -1 to quit: ");
          int grade = input.nextInt();

          while(grade!=-1) {
               total = total + grade;
               gradeCounter = gradeCounter + 1;

               System.out.println("Enter grade or enter -1 to quit: ");
               grade = input.nextInt();

          } // end while loop

          if(gradeCounter!=0) {
               double average = (double) total/gradeCounter;

               System.out.printf("%nTotal of the %d grades entered is %d%n", gradeCounter, total);
               System.out.printf("Class average is %.2f%n", average);
          } else {
               System.out.println("No grade were entered");
          }
     } // end main method

} // end SentinelGrader class
