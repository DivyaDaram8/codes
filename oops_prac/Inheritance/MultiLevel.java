class School{
    String schoolName = "XYZ School";

}
class College extends School {
    String collegeName = "ABC College";
}
class University extends College {
    String universityName = "PQR University";
}

public class MultiLevel {
    public static void main(String[] args) {
        University u = new University();
        System.out.println(u.schoolName);
        System.out.println(u.collegeName);
        System.out.println(u.universityName);
    }
}

//======== NOTES FROM THE ABOVE CODE ========
// 1. Multi-level inheritance is when a class inherits from its parent class, which in turn parent class inherits from another class.
// 2. In this example:
//    - University extends College → inherits from College.
//    - College extends School → inherits from School.
// 3. The University class can access fields and methods from both College and School classes.
// 4. This allows for a hierarchical structure where properties and behaviors can be shared across multiple levels of classes.
// 5. Multi-level inheritance is useful for creating a chain of classes that build upon each