// class Parent{
//     Parent(){
//         System.out.println("Parent Constructor");
//     }
// }
// class Child extends Parent{
//     Child(){
//         //super(); // super keyword  is added by default which is the reason why parent constructor is called first.
//         System.out.println("Child Constructor");
//     }
// }

// public class Construc3 {
//     public static void main(String[] args) {
//         Child ch = new Child();
        
//     }
// }



// What is the result?
//  Parent Constructor
//  Child Constructor
// Because the constructor of the parent class is called first, then the constructor of the child class is called. Because the child class is extending the parent class. The constructor of the parent class is called first, then the constructor of the child class is called.
// The correct answer is: Parent Constructor Child Constructor



class Parent{
    Parent(int a){
        System.out.println("Parent Constructor");
        System.out.println("Parent : " + a );
    }
}
class Child extends Parent{
    Child(int b){
        //super(); // super keyword  is added by default which is the reason why parent constructor is called first.
        super(10); // now runs because the super is given with a parameter. we can also pass b to the super it means to the parent class
        System.out.println("Child Constructor");
    }
}

public class Construc3 {
    public static void main(String[] args) {
        Child ch = new Child(20);
        
    }
}

// What is the result?

// Error, because parent constructor contains a parameter and child constructor does not contain any parameter in the super().

 // if the super is given with a parameter then it runs.

 



 // If the constructor is given private of the class, then we can't create objects to that class.
