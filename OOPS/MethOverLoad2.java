class MethOverLoad2{
    void sum(int a, int b){ 
        System.out.println("Sum of two integers: "+(a+b));
    }
    void sum(double a, double b){
        System.out.println("Sum of two doubles: "+(a+b));
    }
    public static void main(String[] args) {
        MethOverLoad2 obj = new MethOverLoad2(); // creating an object obj of the class MethOverLoad2 instead of creating another class and calling the object of that class
        obj.sum(10, 20);
        obj.sum(10.5, 20.5);
    }
}
//calling the MethOverLoad2 class and creating an object obj of the class
// calling the sum method with two integer parameters
// calling the sum method with two double parameters


//as per my view method overloading is of two types
//1. creating separate classes and calling the object of that class in the main class
//2. calling the object of the class in the same class and calling the method using that object
//in the above code, I have used the second type of method overloading

