class A {
    int a = 0;  // Instance variable
    static int b = 0;  // Static variable (shared among all instances)
}

public class StaticEx1 {
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new A();
        a1.a++; // Modifies only a1's instance variable
        A.b++;  // Correct way to increment static variable, b = 1 now (shared among all instances)
        a2.a++; // Modifies only a2's instance variable
        A.b++;  // Again modifying static variable, b = 2 now (shared among all instances)
        // can also mention A.b++ as a2.b++

        System.out.println("a1.a: " + a1.a + " a1.b: " + A.b);
        System.out.println("a2.a: " + a2.a + " a2.b: " + A.b);
    }
}
