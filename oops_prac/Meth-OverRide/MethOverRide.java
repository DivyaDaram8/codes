// Parent class
class Teacher {
    // Method to be overridden
    void display() {
        System.out.println("Teacher class display method");
    }
}

// Child class that extends Teacher
class Student extends Teacher {
    // This method overrides the display method of the Teacher class
    @Override
    // Annotation @Override is optional but recommended for clarity
    void display() {
        System.out.println("Student class display method");
    }
}

public class MethOverRide {
    public static void main(String[] args) {

        // Creating an object of Teacher class
        Teacher t = new Teacher();  
        // Reference type: Teacher
        // Object type: Teacher
        t.display();  
        // Output: Teacher class display method
        // Calls Teacher's display() method

        // Creating an object of Student class
        Student s = new Student();  
        // Reference type: Student
        // Object type: Student
        s.display();  
        // Output: Student class display method
        // Calls Student's overridden display() method
    }
}

 //  This example clearly shows METHOD OVERRIDING:
        // - Child class (Student) overrides a method from parent class (Teacher)
        // - Method has the same name, same return type, and same parameters
// @Override should be used only when you are overriding a method from the parent class.
// if @Override is used on a method that is not overriding any parent class method, it will give a compilation error.
// It will also give a compilation error if you try to override a method with different parameters or return type or change method name.