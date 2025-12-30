class Parent {
    Parent (int a) {
        System.out.println(a);
    }
}
class Child extends Parent {
    Child(int a) {
        super(5); // Calls the constructor of Parent class
        System.out.println("Child class constructor    " + a);
    }
    void show() {
        System.out.println("Child class show method");
    }
}
public class SuperEx1 {
    public static void main(String[] args) {
        Child ch = new Child(8);
        ch.show();
    }
}

// ==== Notes on Super Keyword in Java ====
// 1. The `super` keyword is used to refer to the parent class.
// 2. If the parent class has a constructor with parameters, you can call it using `super(parameters)`.