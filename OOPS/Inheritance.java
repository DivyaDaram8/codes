class Principal{
    String clgName = "ABC College";
    String principalName = "XYZ";
    public void displayP(){
        System.out.println("in principal class");
    }
}

class Teacher extends Principal{ // Teacher class inherits the properties of the Principal class
    // String clgName; 
    // String principalName;
    // clg name and principal name is same for both teachers and students, so we can create a separate class for them and inherit them in the teacher and student class 
    String name;
    int age;
    String designation;
    double salary;
    public Teacher(String name, int age, String designation, double salary){
        this.name = name;
        this.age = age;
        this.designation = designation;
        this.salary = salary;
    }
    public void display(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: " + salary);
    }
}
class Student extends Principal{ // Student class inherits the properties of the Principal class
    // String clgName; 
    // String principalName;
    // clg name is same for both teachers and students, so we can create a separate class for them and inherit them in the teacher and student class
    String name;
    int rollNo;
    String branch;
    int year;
    public Student(String name, int rollNo, String branch, int year){
        this.name = name;
        this.rollNo = rollNo;
        this.branch = branch;
        this.year = year;
    }
    void display(){
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Branch: " + branch);
        System.out.println("Year: " + year);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("chinnu", 13, "developer", 100000);
        t1.display();
        System.out.println(t1.clgName);
        System.out.println(t1.principalName);
        // Student s1 = new Student("ram", 19, "cse", 3);
        // s1.display();   
        // System.out.println(s1.clgName);
        // System.out.println(s1.principalName);
        t1.displayP(); // calling the displayP method of the principal class using the object of the teacher class
        Principal p1 = new Principal(); // principal can also be created as an object
        p1.displayP(); // calling the displayP method of the principal class using the object of the principal class
        System.out.println(t1.clgName);
    }
}

// This type is hierarchical inheritance.




// Mutli level Inheritance which means the child class can access all the properties of parent class and grand parent class
//Types of Inheritance
// 1. Single Inheritance - one parent class and one child class
//   A
//   |
//   B

// 2. Multi level Inheritance - one parent class and multiple child classes
//   A
//   |
//   B
//   |
//   C

// 3. Hierarchical Inheritance. - one parent class and multiple child classes.
//   A
//   |
//  B  C

// 4. Multiple Inheritance - class inherits from multiple parent classes.
//   A  B
//    \/
//    C

// 5. Hybrid Inheritance - mix of any two or more types of inheritance.
//   A
//   |
//   B
//   /\
//  C  D
