package oops_prac.NonAccessModifiers;


abstract class AbstractClass {
    int a = 10; // Concrete variable
    abstract void display();
    // Abstract method without a body

    void show() {
        System.out.println("This is a concrete method in an abstract class.");
    }// concrete method as because it has a body and is not declared abstract
}

class Util extends AbstractClass {
    @Override
    void display() {
        System.out.println("Display method implemented in Util class.");
    }
}

public class AbstractEx {
    public static void main(String[] args) {
        Util util = new Util();
        util.display();
        util.show();
    }
}

// ======== Notes on Abstract Classes in Java =======
// 1. Abstract classes cannot be instantiated directly, i.e., you cannot create an object of an abstract class.
// 2. It should be extended by another class that provides implementations for the abstract methods.
// 3. An abstract class can have both abstract methods (without body) and concrete methods i.e normal methods with a body.
// 4. Abstract methods must be created only in abstract classes.
// 5. only class and methods can be declared as abstract, not variables.
