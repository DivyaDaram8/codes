class Mol{
    void func(){
        System.out.println(1);
    }
    void func(int a){ // method overloading(creating a method with the same name but different parameters)
        System.out.println(2);
    }
    void func(int a, int b){ 
        // method overloading(creating a method with the same name but different parameters). 
        // The number of parameters should be different OR
        // the type of parameters should be different  OR
        // the order of parameters should be different.
        System.out.println(3);
    }
    void func(String a, int b){
        System.out.println(4);
    }
    void func(int a, String b){
        System.out.println(5);
    }
    // 4 and 5 same type of parameters but different order
}
public class MethOverLoad{
    public static void main(String[] args){
        Mol m = new Mol();
        m.func();
        m.func(1);
        m.func(1,2);
        m.func("div", 2);
        m.func(2, "div");
    }
}

// Method overloading is a feature that allows a class to have more than one method having the same name, if their argument lists are different.
// It is similar to constructor overloading in Java, that allows a class to have more than one constructor having different argument lists.
// Method overloading is used to add more to the behavior of methods and there is no need to create a new method name.
// Method overloading is a compile-time polymorphism.
// Method overloading is also known as static polymorphism.
// Method overloading is a type of polymorphism.
