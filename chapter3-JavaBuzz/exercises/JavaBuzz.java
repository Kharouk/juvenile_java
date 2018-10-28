import java.util.ArrayList;

public class JavaBuzz {
  public static void main(String[] args) {
    ArrayList<Integer> javaBuzzAry = new ArrayList<Integer>(100);
    for (int i = 1; i < 101; i++) {
      javaBuzzAry.add(i);
    }
    for (int i = 0; i < javaBuzzAry.size(); i++) {
      if (i % 3 == 0 && i % 5 == 0) {
        System.out.println("JavaBuzz");
      } 
      else if (i % 3 == 0) {
        System.out.println("Java");
      }
      else if (i % 5 == 0) {
        System.out.println("Buzz");
      } else {
        System.out.println(i);
      }
    }
  }
}
// "Java" if divisible by 3
// "Buzz" if divisible by 5
// "JavaBuzz" if divisible by 15
