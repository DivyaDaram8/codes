class Parent {
    Parent() {
        System.out.println("Parent class display method");
    }
}
class Child extends Parent {
    Child() {
        super(); // Calls the constructor of Parent class
        System.out.println("Child class display method");
    }
    void show() {
        System.out.println("Child class show method");
    }
}
public class SuperEx {
    public static void main(String[] args) {
        Child ch = new Child();
        ch.show();
    }
}

// ========= Notes on Super Keyword in Java =======
// 1. The `super` keyword is used to refer to the parent class.
// 2. whenever a child class constructor is called, it implicitly calls the parent class constructor
//    using `super()`.