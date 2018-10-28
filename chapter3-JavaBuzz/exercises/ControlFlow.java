// what imports will you need?
import java.util.Scanner;
// can you remember how to set up your main function?
public class ControlFlow {
  public static void main(String[] args) {
  // find a way to read in user input
    Scanner scan = new Scanner(System.in);
    System.out.println("Please give me a number: ");
    int number = scan.nextInt();
  // write a method that will check if a number is odd or even
  // (assume user only ever enters integers)
    if (number % 2 == 0) {
      // print the answer to the console
      System.out.println("Your number " + number + " is even.");
    } else {
      // print the answer to the console
      System.out.println("Your number " + number + " is odd.");
    }
  }
}
