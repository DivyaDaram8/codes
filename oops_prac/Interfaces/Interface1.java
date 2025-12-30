interface teacher{
    // Interface variables are implicitly public, static, and final (constants), so they must be initialized with a value
    int id = 101;
    String name = "John Doe";
    // Method declarations in interfaces have no body
    void collegeName();
}

interface student{
    int id = 202;
    String name = "Abraham Doe";
    
    void collegeName();
}


class College implements teacher, student {
    @Override
    // Interface methods must be implemented with a public method body
    public void collegeName() {
        System.out.println("College Name: ABC College");
    }
}

public class Interface1 {
    public static void main(String[] args) {
        College clg = new College();

        // Accessing interface variables using interface name (since they are static)
        System.out.println("Teacher ID: " + teacher.id);
        System.out.println("Student Name: " + student.name);
        clg.collegeName();
    }
}

/* ========== KEY POINTS ==========
1. Interfaces in Java define abstract methods and constants (public static final variables).
2. A class can implement multiple interfaces using the `implements` keyword.
3. All methods in interfaces are implicitly public and abstract, so the implementing class must provide their bodies.
4. Variables in interfaces are constants and accessed using the interface name.
5. The `College` class implements both `teacher` and `student` interfaces and overrides the shared method.
6. The implementing class must provide the actual method definition.
*/