class A{
    static String name = "static";
}


public class StaticEx {
    public static void main(String[] args) {
        System.out.println(A.name); // as we have given static to the variable name, we can access it without creating an object of class A
    }
}
