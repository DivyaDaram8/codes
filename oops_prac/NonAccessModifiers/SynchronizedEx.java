package oops_prac.NonAccessModifiers;

class Example {
    private int count = 0;
    
    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

public class SynchronizedEx {
    public static void main(String[] args) throws InterruptedException {
        Example ex = new Example();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) ex.increment();
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) ex.increment();
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final count: " + ex.getCount());
    }
}


// ========= Notes on Synchronized Methods in Java =======
// 1. Synchronized methods ensure that only one thread can access the method at a time.
// 2. It is used to prevent thread interference and memory consistency errors.
// 3. Prevents race conditions in multi-threaded environments.
// 4. Race conditions occur when multiple threads read and write shared data concurrently, leading to unpredictable results.