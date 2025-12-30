class College{
    String collegeName = "ABC College";

    class Teacher{
        String teacherName = "John Doe";
        
        void display() {
            System.out.println("College Name: " + collegeName);
            System.out.println("Teacher Name: " + teacherName);
        }
    }
}

public class InnerClass1 {
    public static void main(String[] args) {
        College clg1 = new College();
        College.Teacher teacher1 = clg1.new Teacher();
        teacher1.display();
        System.out.println("-------------------------");
        System.out.println("Accessing College Name: " + clg1.collegeName);
        System.out.println("Accessing Teacher Name: " + teacher1.teacherName);
    }
}

// This example demonstrates the use of inner classes in Java.
// - The `Teacher` class is defined inside the `College` class.
// - The `Teacher` class can access the members of the `College` class directly.
// - An instance of the inner class `Teacher` is created using an instance of the outer class `College`.
// - The inner class can access the outer class's members.