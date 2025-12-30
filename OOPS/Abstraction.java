abstract class Shape{
    abstract void draw();
}

class Circle extends Shape{
    void draw(){
        System.out.println("Drawing Circle");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Shape s = new Circle();
        s.draw();
    }
}

//NOTES:
// 1. Hides implementation details and exposes only the essential features of an object.
// 2. This can be achieved using abstract classes and interfaces.
