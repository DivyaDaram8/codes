package oops_prac.NonAccessModifiers;

// Rule 1: Static members belong to the class, not to objects
class Parent {

    static int a = 10; // Static variable - belongs to class
    int b = 20;        // Non-static variable - belongs to object

    //  Rule 2: Static methods can't access non-static members directly, if to accesss then need to create object
    public static void staticMethod() {
        System.out.println("Inside static method");
        System.out.println("Static variable a: " + a); //  Accessing static variable

        // System.out.println("Non-static variable b: " + b);  Illegal
        // Can't access non-static member 'b' from static method
    }

    //  Rule 3: Non-static methods can access both static and non-static members
    public void nonStaticMethod() {
        System.out.println("Inside non-static method");
        System.out.println("Non-static variable b: " + b); 
        System.out.println("Static variable a: " + a);    
    }

    //  Rule 4: Inner classes can be static but outside main class cannot be static
    static class InnerStatic {
        static void show() {
            System.out.println("Inside static inner class");
            System.out.println("Accessing static member a: " + a); 
        }
    }
}


// Rule 6: Static methods can't be overridden in subclasses
// even overridden in upcasting, output still will be the parent class's static method
class SuperClass {
    static void display() {
        System.out.println("Static method in SuperClass");
    }
}
class SubClass extends SuperClass {
    static void display() {
        System.out.println("Static method in SubClass");
    }
}

//  Rule 5: Static members can be accessed directly using class name, no object creation needed
public class StaticEx {
    public static void main(String[] args) {

        // Accessing static variable using class name
        System.out.println("Accessing static variable directly: " + Parent.a);

        // Calling static method without creating object
        Parent.staticMethod();

        // Creating object to call non-static method
        Parent p = new Parent();
        p.nonStaticMethod();

        // Accessing static inner class and calling its static method
        Parent.InnerStatic.show();

        // Demonstrating that static methods can't be overridden
        SuperClass sc = new SubClass();
        SubClass.display();
        sc.display();  // Calls SuperClass's static method
        
    }
}




