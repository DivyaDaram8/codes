class Student{ // class creation
    String name;
    int rollNo;
    String branch;
    int year;
    public Student( String n, int rn, String b, int y){ // constructor creation
        System.out.println("Constructor called");
        System.out.println("Name: " + n);
        System.out.println("Roll No: " + rn);
        System.out.println("Branch: " + b);
        System.out.println("Year: " + y);
        System.out.println(name); // prints null
        System.out.println(rollNo); // prints 0
        name = n;
        rollNo = rn;
        year = 5;
    }
}


class ConstrucBasics{
    public static void main(String[] args){
        Student s1 = new Student("div",18,"cys", 3); // object creation
        System.out.println(s1.name); // prints null before assigning value to name = n in the constructor, after assigning prints div
        System.out.println(s1.rollNo); // prints 0 before assigning value to rollNo = rn in the constructor, after assigning prints 18
        System.out.println(s1.year); // prints 0 before assigning value to year = 5 in the constructor, after assigning prints 5
    }
}