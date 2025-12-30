
// Owner class acts as a superclass for inheritance
class Owner {

    // Public variable: accessible from anywhere (inside or outside the package)
    public String ownername = "Divya";

    // Default (package-private) access modifier: accessible only within the same package.
    // Since no modifier is explicitly declared, 'age' has default access.
    int age = 30;
    int num = 124;
    // Public method: can be accessed from any object of this class or its subclasses
    public void Boom(){
        System.out.println("Boom!");
    }
    // Method with default access (no modifier)
    // This can only be accessed within the same package
    void Boom2() {
        System.out.println("Boom2!");
    }
}

// Subclass TeaShop inheriting from Owner
class TeaShop extends Owner {
    public String name;
    public int cupsSold;
    public int pricePerCup;

    public TeaShop(String name, int cupsSold, int pricePerCup) {
        this.name = name;
        this.cupsSold = cupsSold;
        this.pricePerCup = pricePerCup;
    }
}
public class Example1 {
    public static void main(String[] args) {
        TeaShop ts1 = new TeaShop("Vnkp",45, 30);
        System.out.println("Tea Shop Name: " + ts1.name);
        System.out.println(ts1.ownername);
        System.out.println(ts1.age);
        System.out.println(ts1.num);
        ts1.Boom();
        ts1.Boom2(); // This will work only if Example1.java is in the same package as Owner.java

        Owner o1 = new Owner();
        o1.Boom();
    }
}


/*
======== NOTES FROM THE ABOVE CODE ========

1. Inheritance:
   - TeaShop extends Owner → inherits all non-private fields and methods.

2. Access Modifiers (Variables):
   - 'ownername' is public → accessible everywhere.
   - 'age' and 'num' have default (package-private) access → accessible only within same package.

3. Access Modifiers (Methods):
   - Boom() is public → accessible from anywhere, even other packages.
   - Boom2() has default access → only accessible within same package.

4. Object Usage:
   - ts1 (TeaShop object) can access inherited variables and methods from Owner.
   - o1 (Owner object) can access only what is declared inside Owner class.

5. Package Dependency:
   - If Example1 is moved to a different package, it won't be able to access 'age', 'num', or Boom2() since they have default access.

6. Method Inheritance:
   - Public and default methods (if in same package) are inherited by subclasses.

7. Real-World Practice:
   - Use 'public' if you need global access.
   - Use 'protected' for inheritance across packages.
   - Use 'default' only when classes stay within the same package.
*/