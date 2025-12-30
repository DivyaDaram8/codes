abstract class AbstractClass {
    int a = 5;
    abstract void display();
    void func(){
        System.out.println("Non-abstract method");
    }
}
class abs extends AbstractClass{
    @Override
    void display(){ //abstract methods should be overridden in the subclass
        System.out.println("Abstract method");
    }
}


public class Abstract1 {
    public static void main(String[] args) {
        abs obj = new abs();
        System.out.println(obj.a);
        obj.display();
    }
}


// NOTES:
// 1. Abstract class is a class that is declared using the abstract keyword.
// 2. Abstract classes can contain both abstract methods and non-abstract methods.
// 3. Abstract class should be extended by other class

// 4. If a class is abstract we cannot directly create its object.
// 5. Abstract methods do not have a body, only declaration
// 6. Abstract methods should be overridden in the subclass
// 7. Abstract methods can be created only in abstract class.

