class Student{ // class creation
    String name;
    int rollNo;
    String branch;
    int year;
    public Student(String n, int rn, String b, int y){ // constructor creation
        name = n; // assigning value to name
        rollNo = rn; // assigning value to rollNo
        branch = b; // assigning value to branch
        year = y; // assigning value to year
    }
    public void display(){ // method creation (function inside a class)
        System.out.println("Name: " + name); // prints the name
        System.out.println("Roll No: " + rollNo);
        System.out.println("Branch: " + branch);
        System.out.println("Year: " + year);
    }
}

class Constuc2{
    public static void main(String[] args){
        Student s1 = new Student("div", 18, "cse", 3); // object creation
        s1.display(); // calls the display method
        Student s2 = new Student("ram", 19, "hs", 2); // object creation
        s2.display(); // calls the display method
    }
}