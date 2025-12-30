class Student{ // class creation
    String name;
    int rollNo;
    String branch;
    int year;
    public void func(String s){ // method creation (function inside a class)
        System.out.println("Function called in Student class and parameter is " + s);
    }
}

class ClObjMeth{
    public static void main(String[] args){
        Student s1 = new Student(); // object creation
        Student s2 = new Student(); // object creation
        System.out.println(s1.name); // prints null
        System.out.println(s1.rollNo); // prints 0
        s2.branch = "CSE";
        s2.year = 2021;
        System.out.println(s2.branch); // prints CSE
        System.out.println(s2.year); // prints 2021
        s1.func("huhuu"); // calls the func and prints Function called
    }
}