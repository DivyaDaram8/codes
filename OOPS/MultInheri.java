// Multi level Inheritance
// A -> B -> C  (A is parent of B and B is parent of C)
// C can access all the properties of A and B

class A{
    int i = 10;
}
class B extends A{
    int j = 20;
}
class C extends B{
    int k = 30;
}
public class MultInheri {
    public static void main(String[] args){
        C c1 = new C();
        System.out.println(c1.i);
        System.out.println(c1.k);
        System.out.println(c1.j);
    }
}

