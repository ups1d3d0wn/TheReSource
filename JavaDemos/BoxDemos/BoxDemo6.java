

public class BoxDemo6 {
     public static void main(String[] args) {
          // declare allocate and initialize Box objects
          Box mybox1 = new Box(10, 10, 10);
          Box mybox2 = new Box(6, 5, 5);

          double vol;

          vol = mybox1.volume();
          System.out.println("Volume is: " + vol);

          vol = mybox2.volume();
          System.out.println("Volume is: " + vol);
     }

}
