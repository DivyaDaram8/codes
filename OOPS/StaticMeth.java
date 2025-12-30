// class Ex{
//     static int a = 10;
//     static void display(){ // static method can access only static members, so a is defined as static
//         System.out.println("a: " + a);
//     }
// }
// public class StaticMeth {
//     public static void main(String[] args) {
//         Ex.display(); // as display is static, we can access it without creating an object of class Ex
//     }
// }



class Outer {
    static int staticVar = 10;
    int nonStaticVar = 20;

    // Static method in outer class
    static void staticMethod() {
        System.out.println("Static method in outer class");
        System.out.println("StaticVar: " + staticVar);
        // System.out.println("NonStaticVar: " + nonStaticVar); //  Cannot access non-static variable
    }

    // Non-static method in outer class
    void nonStaticMethod() {
        System.out.println("Non-static method in outer class");
    }

    // Static nested class (can have static methods and variables)
    static class StaticNested {
        static void nestedStaticMethod() {
            System.out.println("Static method in static nested class");
        }
    }

    // Non-static inner class (cannot have static methods)
    class Inner {
        // static void innerStaticMethod() {} // Not allowed
        void innerMethod() {
            System.out.println("Non-static method in inner class");
        }
    }
}

public class StaticMeth {
    public static void main(String[] args) {
        // Accessing static method of outer class
        Outer.staticMethod();

        // Accessing static method of static nested class
        Outer.StaticNested.nestedStaticMethod();

        // Creating an instance of non-static inner class
        Outer outer = new Outer();
        outer.nonStaticMethod();
        Outer.Inner inner = outer.new Inner();
        inner.innerMethod();
    }
}



//NOTE
// 1. Static methods can access only static members.
// 2. Static methods can be accessed without creating an object of the class.
// 3. Static methods can be accessed using the class name.
// 4. Static methods can access static members directly.
//5. Inner class methods can be static, but inner class variables cannot be static.
//6. Outer class can't be static, but it can have static methods."
