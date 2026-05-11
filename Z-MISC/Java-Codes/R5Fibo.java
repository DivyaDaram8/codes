import java.util.Scanner;
public class R5Fibo {
    static int Fibo(int num){
        if(num<=1){
            return num;        
        }
        int last = Fibo(num-1);
        int sec_last = Fibo(num-2);
        return last + sec_last;
    }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int res = Fibo(n);
        System.out.println("The fibonacci of "+n+ " is "+res);
        s.close();
    }
}
//tc is almost O(2^n) but not exactly to it ,though it is in exponential in nature
