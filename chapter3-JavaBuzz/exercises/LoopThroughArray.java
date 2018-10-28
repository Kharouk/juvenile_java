// can you remember how to set up your main function?
public class LoopThroughArray {
  public static void main(String[] args) {
    // loop through an integer array and print out each element
    int[] intAry = new int[5];
    intAry[0] = 0;
    intAry[1] = 1;
    intAry[2] = 2;
    intAry[3] = 3;
    intAry[4] = 4;
    for (int i = 0; i < intAry.length; i++) {
      System.out.println(intAry[i]);
    }
  }
}
