class A {
    int i = 10;
    public void display(){
        System.out.println(i);
    }
}
class B extends A {
    int j = 20;
    public void display(){
        System.out.println(j);
    }
}
class C extends A {
    int i = 30;
    public void display(){
        System.out.println(i);
    }
}
// classs D extends B, C { // Compile time error
//     int i = 40;
//     public void display(){
//         System.out.println(i);
//     }
// }

public class Multiple {
    public static void main(String[] args){
        C c1 = new C();
        System.out.println(c1.i);
        c1.display();
    }
}

//Mutliple Inheritance is not supported in Java.
//If a class extends more than one class, it will give compile time error.
// If class A and class B have same method display() and class C extends both A and B, then it will give compile time error.
// If class A and class B have same variable i and class C extends both A and B, then it will give compile time error.
// So Java does not support Multiple Inheritance.
// Because of Diamond Problem multiple inheritance is not supported in Java.
// Consider classes A, B, C and D as follows:
//  A
// / \
// B   C
// \ /
//  D
// A contains display method which displays 10.
// B contains display method which displays 20.
// C contains display method which displays 30.
// D contains display method which displays 40.
// B, C extends A.
// D extends both B and C.
// If we create object of D and call display method, then which display method will be called?
// Already B, C overrides display method of A.
// So, D will have two display methods.
// So, it is ambiguous to call display method of D. 
// This is called Diamond Problem.
// To avoid this problem, Java does not support Multiple Inheritance.
// To achieve multiple inheritance, we can use interfaces.




