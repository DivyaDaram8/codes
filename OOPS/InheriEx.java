// Parent class
class Parent {
    int x = 10; // Parent variable
    int commonVar = 100; // Same variable in Parent and Child

    void show() {
        System.out.println("Parent class method");
    }

    static void staticShow() {
        System.out.println("Parent static method as static methods cannot be overridden");
    }
}

// Child class (inherits Parent)
class Child extends Parent {
    int y = 20; // Child variable
    int commonVar = 200; // Same variable as in Parent, but in Child

    @Override
    void show() {
        System.out.println("Child class method");
    }

    static void staticShow() {
        System.out.println("Child static method");
    }
}

public class InheriEx {
    public static void main(String[] args) {
        // Parent reference and Parent object
        Parent p1 = new Parent();
        System.out.println("p1.x: " + p1.x); 
        System.out.println("p1.commonVar: " + p1.commonVar); 
        p1.show(); 
        Parent.staticShow(); 

        // Child reference and Child object
        Child c1 = new Child();
        System.out.println("c1.x: " + c1.x); 
        System.out.println("c1.y: " + c1.y); 
        System.out.println("c1.commonVar: " + c1.commonVar); 
        c1.show(); 
        Child.staticShow(); 

        // Parent reference but Child object (Upcasting)
        Parent p2 = new Child();
        System.out.println("p2.x: " + p2.x); 
        System.out.println("p2.commonVar: " + p2.commonVar); 
        p2.show(); 
        p2.staticShow();  //displays the parent class static method as static methods cannot be overridden
    }
}
