The first line defines a class called Main.
The arguments we get inside the method are the arguments that we will get when running the program with parameters. It's an array of strings:
```java
public class Main {
    public static void main(String[] args) {
      System.out.println("Hello, World!");
    }
}
```

`public`
---
- Makes the class public, so that other classes can access it.
- when we declare a public class, we must declare it inside a file with the same name (Main.java)

`class`
---
- every line of code in Java needs to be inside a class
- the variable after defines the class (Main)

`static`
---
- allows you to run the method without creating an instance of Main

`void`
---
- this method doesn't return any value
  
`main`
---
- name of the method (also name of the class)
  
`System`
---
- This is a predefined class; Java provides it to us and holds some useful methods and variables.
  
`out`
---
- this is a static variable within **System** that represents the output of your program (stdout)
  
`println`
---
- a method belonging to __out__ and can be used to print a line
