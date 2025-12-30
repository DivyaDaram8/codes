package oops_prac.NonAccessModifiers;

class A{
    final int x = 10; // Final variable

    final void display() { // Final method
        System.out.println("This is a final method.");
    }
}

class B extends A {
    // Cannot override the final method from A
    // void display() { 
    //     System.out.println("Trying to override a final method.");
    // }
}

final class C { // Final class
    void show() {
        System.out.println("This is a final class method.");
    }
    // This class cannot be extended by any other class.
}

// class D extends C { 
    //Cannot extend final class C as it is declared final
// }   

public class FinalEx {
    public static void main(String[] args) {
        A obj = new A();
        System.out.println("Value of x: " + obj.x);
        // obj.x = 20; // This line would cause a compile-time error because x is final and cannot be reassigned.
    }
}

// ======== Notes on Final Keyword in Java =======
// 1. The `final` keyword makes a variable, method, or class unchangeable.
// 2. Final variables cannot be reassigned after initialization.
// 3. Final methods cannot be overridden in subclasses.
// 4. Final classes cannot be extended by other classes.
// 5. Final variables must be initialized when declared or in the constructor.