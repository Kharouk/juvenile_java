## Compiled Language:
  - A program, once compiled, is expressed in the instructions of the target machine. 
  - code is executed natively through the OS after it is converted to machine code (via compilation)
  - Benefits:
    - faster performance by directly using the native code of the target machine
    - opportunity to apply quite powerful optimisations during the compile stage

## Interpreted Language:
  - the instructions of the code are not directly executed by the target machine, but instead read and executed by another program (which is usually written in the language of the native machine)
  - code is evaluated line by line through another program which handles executing the code instead of the OS itself(via interpretation)
  - Benefits:
    - Easier to implement
    - no need to run a compilation stage: can execute code directly 'on the fly'
    - can be more convenient for dynamic languages


## General Notes:
  - Depend on both to get our written code into a form that the computer can execute
  - most programming languages have both compiled implementations and interpreted implementations, and thus you can't really classify an entire language as being compiled or interpreted

