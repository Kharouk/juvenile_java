In most programming languages, a compiler or interpreter generates code that can execute on a specific target machine.
  - For example, compiling a C++ program on a Windows machine, the executable can by copied to other Windows machines but not a Mac or a Linux
  - So the platform is determined by the target machine (along with the OS)
  - So before if you wanted to write a program for multiple platforms, you as the programmer would have to create multiple version of your source code.

Java succeeded in eliminating the platform issue for high-level programmers because it has reorganized the compile-link-execute sequence at the underlying level of the compiler.
  - The designers of Java isolated these programming issues which are dependent on the platform and developed low-level means to abstractly refer to these issues.
  - So, the Java compiler creates a bytecode file, rather than an object file. It is essentially an object file for a virtual machine.
  - the Java compiler is often called the JVM (Java Virtual Machine) compiler.
  - so you can write a Java program on any platform, and use the JVM compiler (called javac) to generate a bytecode file (extension .class). this file can be used on any platform (that has installed Java)

However, bytecode is not an executable file. To execute, you need to invoke a Java interpreter (called java). Each platform has its own interpreter. 
  - To summarize how Java works (to achieve platform independence), think about the compile-link-execute cycle. Earlier programming languages are defined as: *compile-link then execute*. Java is more: *compile then link-execute*.


Other Java advantages:
- applets
  - writing programs designed for the World Wide Web; putting the bytecode on a web page.
- library-based
  - designers of the language have included a multitude of pre-existing programs.
  - a programmer can connect to these programs as needed.
  - one library is API. 

**C# vs. Java**
  - C# was the first major language after Java to have the *compile then link-execute*. C# has addressed many of Java's advantages and then some. But Microsoft does not seem interested in true platform independence (no C# bytecode interpreter in Linux). Also need to make purchases for some libraries in C#... 🤔

**Whats a linker?**
The process of *linking* connects the object files that you have created along with other pre-existing object files to form an executable file. The **linker** does this job. Link errors occur when the object files for your program don't completely communicate appropriately.