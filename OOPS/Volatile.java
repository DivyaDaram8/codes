public class Volatile {
    public static void main(String[] args) {
        Example ex = new Example();
        ex.show();
    }
}
class Example {
    volatile boolean flag = true; // 1
    void show() {
        System.out.println(flag);
    }
}
// NOTES
// 1. Volatile prevents threads from caching the value of the variable; always reads from the main memory
