class A {
    public int num = 20;

    // Method without parameters
    public void info() {
        System.out.println("In the Info");
    }

    // Method with parameter
    public void paraInfo(int x) {
        System.out.println("Num is :" + x);
    }
}

// First child class inheriting from A
class Child1 extends A {
    int c11;
    int c12;

    public Child1(int c1, int c2) {
        this.c11 = c1;
        this.c12 = c2;
    }
}

// Second child class also inheriting from A
class Child2 extends A {
    int c21;
    int c22;

    public Child2(int c1, int c2) {
        this.c21 = c1;
        this.c22 = c2;
    }
}

public class HierarInherit {
    public static void main(String[] args) {
        Child1 ch1 = new Child1(4, 5);
        Child2 ch2 = new Child2(6, 7);

        System.out.println(ch1.num);       // Accessing inherited variable
        System.out.println(ch2.c22);       // Accessing own variable
        ch1.info();                        // Inherited method call
        ch2.paraInfo(10);                  // Inherited method with parameter
    }
}


/*
========= NOTES FROM THE ABOVE CODE =========

1. Hierarchical Inheritance:
   - One superclass (`A`) and multiple subclasses (`Child1`, `Child2`) inherit from it.
   - Both child classes gain access to the methods and variables of the parent.

2. Variable Inheritance:
   - `num` is declared in `A` and inherited by both `Child1` and `Child2`.

3. Method Inheritance:
   - Both `info()` and `paraInfo(int x)` are declared in the parent class and 
     accessed directly by child class objects (`ch1`, `ch2`).

4. Constructors in Child Classes:
   - `Child1` and `Child2` have their own constructors to initialize their unique variables.
   - They don’t need to explicitly call `super()` unless the parent has a parameterized constructor.

5. Real-World Analogy:
   - Think of `A` as a base "Employee" class, and `Child1` and `Child2` as "Developer" and "Manager".
     Both inherit basic employee features like ID, info, etc.

6. Output:
   - `ch1.num` → Inherited value from parent
   - `ch2.c22` → Own value from constructor
   - `info()` and `paraInfo()` → Called from parent via child objects

7. Conclusion:
   - This code is a clear and simple demonstration of **hierarchical inheritance** in Java.
   - It shows how child classes can reuse code from a single parent class efficiently.
*/
