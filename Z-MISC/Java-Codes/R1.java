public class R1 {
   static int count=0;
     static void f(){
        if(count == 3){
            System.out.println("Got the three");
            return;
        }
        else 
        {
            count++;
        }
        f();

    }
    public static void main(String[] args) {
        f();
    }
     
}