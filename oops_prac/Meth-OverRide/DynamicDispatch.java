class Teacher {
    int a = 10;
    void display() {
        System.out.println("Teacher display");
    }
}

class Student extends Teacher {
    int a = 20;
    @Override
    void display() {
        System.out.println("Student display");
    }
}

public class DynamicDispatch {
    public static void main(String[] args) {
        Teacher t = new Student();  // ✅ Upcasting
        t.display();  // Calls Student's display() method due to dynamic dispatch
        // Output: Student display
        System.out.println(t.a);  // Accesses Teacher's a, not Student's a
    }
}

// variables are from left, reference(teacher)
// methods are from right, object(student)

// Notes on Dynamic Dispatch in Java:
// 1. Dynamic Dispatch = Upcasting + method overriding.
//    - Allows a parent class reference to call overridden methods in child classes.
// 2. It works at runtime, determining which method to call based on the actual object type.
