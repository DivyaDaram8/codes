// Interface

interface A {
    int i = 10;
    // void display(){             // Interface methods cannot have body.
    //     System.out.println(i);
    // }
}

interface B {
    int j = 20;
    void display();
}

class C implements A, B {
    int k = 30;
    int i = A.i; // Define i in class C using interface A, so that it can be accessed using object of class C without any error.
    int j = B.j; // Define j in class C using interface B, so that it can be accessed using object of class C without any error.
    public void display(){
        System.out.println(1);
    }
}

public class Interface {
    public static void main(String[] args) {
        C c1 = new C();
        c1.display();
        System.out.println(c1.i); // Accessing i using object of class C
        System.out.println(c1.j); // Accessing j using object of class C
        System.out.println(c1.k);
    }
}

// Interface is a reference type in Java.

// Multiple inheritance is not supported in class. But it is supported in Interface.

// A class can implement multiple interfaces. using implements keyword.

// A class can extend only one class. But a class can implement multiple interfaces.

// It is similar to class. It is a collection of abstract methods.


// Rules 
// 1. Interface methods do not have body.
// 3. Variables in interface must be initialized.
// 4. Interface cannot have constructor.
// 5. by default, methods in interface are public and abstract. so when overriding interface methods, we must use public keyword.
//6. If the method created in the interface is not implemented in the class, then it will throw an error. (ex: display is declared in A, but not overridden in C, so it will throw an error)
//7. If a class implements an interface, then it must override all the methods of the interface. Otherwise, it will throw an error. (ex: display is declared in B, but not overridden in C, so it will throw an error)
 