class Teacher {
    void teach() {
        System.out.println("Teaching...");
    }
}

class Student extends Teacher {
    // @Override
    // void teach() {
    //     System.out.println("Student teaching...");
    // }
    void study() {
        System.out.println("Studying...");
    }
}

public class Upcasting {
    public static void main(String[] args) {
        Teacher t = new Student();  // Upcasting
        t.teach();  // Calls Teacher's method, because there's no overriding
        // if overridden, it would call Student's method
        // t.study();  Not allowed (reference is of type Teacher)
        
        // Output: Teaching...
    }
}

// Notes on Upcasting in Java:
// 1. Upcasting = Assigning a child class object to a parent class reference.
// 2. Allows access only to parent class methods.
// 3. Child class methods not accessible unless overridden.
// 4. Dynamic dispatch occurs only if the method is overridden in the child class.