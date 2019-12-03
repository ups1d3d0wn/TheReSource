/**
* Box uses a constructor to initialize dimensions of box
*
*
*/

public class Box {
     double width;
     double height;
     double depth;

     Box(double d, double h, double w) {
          System.out.println("Constructing a box");
          width = w;
          height = h;
          depth = d;

     } // end Box constructor
     double volume() {
          return width * height * depth;
     }
} // end class Box
