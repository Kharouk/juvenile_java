public class Strings {
  public static void main(String[] args) {
    // declare the first name
    String firstString = "Alex";
    // declare the second name
    String secondString = "Carol";
    // create your message
    String message = String.format("%s and %s, sitting in a tree!", firstString, secondString);
    // print your message!
    System.out.println(message);
  }
}
