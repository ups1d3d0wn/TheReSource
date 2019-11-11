/**
* Counter Controlled Repetition w/ ClassAverage example
* Uses Scanner class to take in input from terminal.
* @author Kevin Murphy
* @version 11/11/2019
*/

import java.util.Scanner;

public class ClassAverage {

     public static void main(String[] args) {
          Scanner input = new Scanner(System.in);

          //initialization phase
          int total = 0;
          int gradeCounter = 1;

          while(gradeCounter <= 10) {
               System.out.println("Enter grade: ");
               int grade = input.nextInt(); // input of next grade
               total = total + grade;
               gradeCounter = gradeCounter + 1;
          } // end while loop
          // termination phase
          int average = total/gradeCounter;

          System.out.printf("%nTotal of all grades is %d%n", total);
          System.out.printf("Class average is %d%n", average);

     } // end main



} // end ClassAverage class
