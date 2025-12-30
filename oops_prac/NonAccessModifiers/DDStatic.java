package oops_prac.NonAccessModifiers;


class Teacher {
    int a = 10;
    static void display() {
        System.out.println("Teacher display");
    }
}
class Student extends Teacher {
    int a = 20;
    static void display() {
        System.out.println("Student display");
    }
}
public class DDStatic {
    public static void main(String[] args) {
        Teacher t = new Student();  // Upcasting
        //t.display();  //calls teacher's display() method due to static binding
        Teacher.display(); // Calls teacher's display() method due to static binding
        Student.display(); // Calls student's display() method due to static binding
        System.out.println(t.a);
    }
}


// ======= Notes on Static Method Binding in Java =======
// 1. Static methods CANNOT be overridden — they are class-level, not instance-level.
// 2. If a subclass defines a static method with the same signature(name and parameters) it HIDES the superclass method but does not override it.
//    - This is known as method hiding.
// 3. Static methods are resolved at COMPILE-TIME based on reference type (not object type).
// 4. There is NO true inheritance or polymorphism with static members.
// 5. Always prefer accessing static methods or variables using the class name, not object reference.
