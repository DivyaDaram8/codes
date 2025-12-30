class Outer {
    int a = 10;
    class Inner{
        int b = 20;
        // void display(){
        //     System.out.println("Inner class b: "+b);
        //     System.out.println("Outer class a: "+a);
        // }
    }
}



public class InnerClass {
    public static void main(String[] args) {
        Outer o1 = new Outer();
        Outer.Inner i1 = o1.new Inner();
        System.out.println(i1.b);
    }
}
