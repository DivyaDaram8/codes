class Counter{
    int count = 0;
    synchronized void increment(){
        count++;
    }
    synchronized void decrement(){
        count--;
    }
}
public class Synchro1 {
    public static void main(String[] main){
        Counter c = new Counter();
        Thread t1 = new Thread(new Runnable(){
            public void run(){
                for(int i=0; i<1000; i++){
                    c.increment();
                }
            }
        });
        Thread t2 = new Thread(new Runnable(){
            public void run(){
                for(int i=0; i<100; i++){
                    c.decrement();
                }
            }
        });
        t1.start();
        t2.start();
        try{
            t1.join();
            t2.join();
        }catch(Exception e){
            System.out.println(e);
        }
        System.out.println("Count: " + c.count);
    }
}
//NOTE:
// 1. Synchornization is used to prevent race condition(i.e. occurs when two or more threads can access shared data and try to change at the same time) in multi threaded environment.
// 2. synchronized keyword can be used with methods and blocks
// 3. Synchronized methods can be used to lock an object for any shared resource
// 4. Ensures thread safety by allowing only one thread to execute the synchronized method at a time.