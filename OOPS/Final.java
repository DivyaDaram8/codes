class A{
    final int a = 10; // final variable
    final void display(){ // final method, cannot be overridden
        System.out.println("Final method");
    }
}

// class A{
//     final int a; // final variable
//     A(){ // value can be modified in constructor if not assigned initially
//         a = 10;
//     }
//     final void display(){ // final method, cannot be overridden
//         System.out.println("Final method");
//     }
// }

public class Final {
    public static void main(String[] args) {
        A a1 = new A();
        // a1.a = 20; // Cannot assign a value to final variable 'a'
        System.out.println("a1.a: " + a1.a);
        a1.display(); // Final method
    }
}

//NOTE:
// 1. class can also have final, but those classes cannot be inherited, gives compilation error if tried to inherit
// 2. final variables can be assigned a value only once, and cannot be modified later
// 3. final methods cannot be overridden
// 4. final methods can be overloaded(overloading is when two or more methods in the same class have the same method name but different parameters)