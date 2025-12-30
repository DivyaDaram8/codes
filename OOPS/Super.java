class Principal {
    String clgName;
    String principalName;

    public Principal(String clgName, String principalName) {
        this.clgName = clgName;
        this.principalName = principalName;
    }

    public void displayP() {
        System.out.println("College Name: " + clgName);
        System.out.println("Principal Name: " + principalName);
    }
}

class Teacher extends Principal { 
    String name;
    int age;
    String designation;
    double salary;

    public Teacher(String clgName, String principalName, String name, int age, String designation, double salary) {
        super(clgName, principalName); // Call the constructor of Principal
        this.name = name;
        this.age = age;
        this.designation = designation;
        this.salary = salary;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: " + salary);
        displayP(); // Display college and principal details
    }
}

class Student extends Principal {
    String name;
    int rollNo;
    String branch;
    int year;

    public Student(String clgName, String principalName, String name, int rollNo, String branch, int year) {
        super(clgName, principalName); // Call the constructor of Principal
        this.name = name;
        this.rollNo = rollNo;
        this.branch = branch;
        this.year = year;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Branch: " + branch);
        System.out.println("Year: " + year);
        displayP(); // Display college and principal details
    }
}

public class Super {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("ABC College", "XYZ", "Chinnu", 30, "Developer", 100000);
        t1.display();

        System.out.println("----------------------------");

        Student s1 = new Student("ABC College", "XYZ", "Ram", 19, "CSE", 3);
        s1.display();
    }
}
