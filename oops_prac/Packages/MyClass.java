package oops_prac.Packages;

import oops_prac.Packages.Teacher.Teacher1;
// Importing the Teacher1 file from the Teacher folder in the Packages directory
class Student1 extends Teacher1 {
    public String studentName = "Jane Doe";
    public int studentAge = 20;

    public void display() {
        System.out.println("Student Name: " + studentName);
        System.out.println("Teacher Name: " + teacherName);
    }
}


// As worldTest is in a different package, we need to import Teacher1 to access its public members. 
// and it is not a subclass of Teacher1, so this is example of World in scope of package.
class worldTest{
    Teacher1 t1 = new Teacher1();
    void show(){
        System.out.println("Teacher Age from worldTest: " + t1.teacherAge);
    }
}

// As A class is in the same package, we can access its public members directly without importing it. 
//Because public package access is allowed within the same package.
class B extends A {
    public void show() {
        System.out.println("Value of a from class A: " + a);
    }
}

public class MyClass {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Student1 student = new Student1();
        student.display();
        System.out.println("Teacher Age: " + student.teacherAge);
        worldTest wt = new worldTest();
        wt.show();
        B b = new B();
        b.show();
    }
}
