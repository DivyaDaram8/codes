class Student{
    String name;
    int rollNo;
    String branch;
    int year;
    // public Student(String name, int rn, String b, int y){
    //     name = "chinnu";
    //     System.out.println(name); // prints div that is passed in the object creation
    //     this.name = "ram";
    //     System.out.println(this.name); // prints null as no value is assigned to this.name(variable of class Student but not the name variable in the constructor
    // }

    public Student(String name, int rollNO, String branch, int year){
        this.name = name;
        this.rollNo = rollNO;
        this.branch = branch;
        this.year = year;
    }
    public void display(){
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Branch: " + branch);
        System.out.println("Year: " + year);
    }
}


class ThisEx{
    public static void main(String[] args) {
        Student s1 = new Student("div", 18, "cse", 3); // object creation
        // System.out.println(s1.name);
        s1.display();
    }
}