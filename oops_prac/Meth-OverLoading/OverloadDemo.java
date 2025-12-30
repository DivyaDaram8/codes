public class OverloadDemo {

    // Method with no parameters
    void fun() {
        System.out.println("No args");
    }

    // Method with one int parameter
    void fun(int a) {
        System.out.println("1 arg: int");
    }

    // Method with two int parameters
    void fun(int a, int b) {
        System.out.println("2 args: int, int");
    }

    // Method with int first, String second
    void fun(int a, String b) {
        System.out.println("2 args: int, String");
    }

    // Method with String first, int second (order matters!)
    void fun(String a, int b) {
        System.out.println("2 args: String, int");
    }

    public static void main(String[] args) {
        OverloadDemo obj = new OverloadDemo();

        obj.fun();             // Calls fun() with no arguments → prints "No args"
        obj.fun(10);           // Calls fun(int) → prints "1 arg: int"
        obj.fun(10, 20);       // Calls fun(int, int) → prints "2 args: int, int"
        obj.fun(2, "boom");    // Calls fun(int, String) → prints "2 args: int, String"
        obj.fun("boom", 3);    // Calls fun(String, int) → prints "2 args: String, int"
    }
}

/*
 Notes on Method Overloading in Java:

1.  Method Overloading = Defining multiple methods with the same name but different parameter lists.
2.  Differentiation is based on:
      - Number of parameters
      - Types of parameters
      - Order of parameters
3.  Return type alone cannot be used to overload methods.
      Example:
          void fun(int a) {}
          int fun(int a) {} //  Compilation error
4.  Overloading provides compile-time polymorphism (Java decides which method to call at compile time).
5.  Use Cases:
      - Constructors with different setups
      - Utility functions that support multiple input types
      - Cleaner, organized APIs
6.  Tip: Even methods like println() in Java are overloaded for int, double, String, Object, etc.

 Overloading = Same method name, different vibes 
*/
