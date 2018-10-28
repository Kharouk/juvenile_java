import java.util.ArrayList;

// can you remember how to set up your main function?
public class Arrays {
  public static void main (String[] args) {
    // declare an array of Strings and print it
    String[] names = new String[3];
    names[0] = "Kyle";
    names[1] = "Megan";
    names[2] = "Stan";
    System.out.println(names); // returns [Ljava.lang.String;@6bc168e5
    for (int i = 0; i < names.length; i++) {
      System.out.println(names[i]);
    }

    // declare an array of integers and print it
    int[] numbers = new int[2];
    int total = 0;
    numbers[0] = 23;
    numbers[1] = 93;
    for (int i = 0; i < numbers.length; i++) {
      total += numbers[i];
    }
    System.out.println(total); // 116

    // declare an ArrayList of integers, add numbers to it, and then print it
    ArrayList<Integer> arrL = new ArrayList<Integer>(2);
    arrL.add(15);
    arrL.add(999);
    arrL.add(23); // even though I initially declared the arraylist with 2, you can add more 'dynamically'
    arrL.add(13);  // also, it seemed to have imported the ArrayList class for me?
    System.out.println(arrL.get(0));
    System.out.println(arrL.get(1));
    System.out.println(arrL.get(2));
    System.out.println(arrL.get(3));
  }
}
