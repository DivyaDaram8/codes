class Student{
    public String name;
    private int rollNo; // as it is private, it cannot be accessed outside the class, so we get error when we try to print the value of rollNo in the main method, so we can only access it in the student class
    String branch;
    int year;
    public Student(String n, int rn, String b, int y){ // constructor creation
        this.name = n; // assigning value to name
        this.rollNo = rn; // assigning value to rollNo
        this.branch = b; // assigning value to branch
        this.year = y; // assigning value to year
    }
    public void display(){ // method creation (function inside a class)
        System.out.println("Name: " + name); // prints the name
        System.out.println("Roll No: " + rollNo);
        System.out.println("Branch: " + branch);
        System.out.println("Year: " + year);
        show(); // calls the show method, as it is a private method, it can only be accessed inside the class Student, so we can call it here. 
    }   
    private void show(){ // private method can only be accessed inside the class student, cannot be accessed outside the class or in the main method of another class. 
        System.out.println("Private method");
    }
}


class PubPri {
    public static void main(String[] args) {
        Student s1 = new Student("div", 18, "cse", 3); // object creation
        s1.display(); // calls the display method
        System.out.println(s1.name); // prints the name
        //System.out.println(s1.rollNo); // cannot access the private variable rollNo outside the class
    }
}
