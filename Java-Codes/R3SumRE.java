import java.util.Scanner;
public class R3SumRE {
    static void Sum(int num,int sum){
        // if(num < 1){
        //sout(sum);
        //     return;
        // }
        // else{
        //     sum=sum+num;
        //     Sum(sum,num-1);
        // }
        
        if(num < 1){
            System.out.println(sum);
            return;
        }
        else{
            Sum(num-1,sum+num);
        }
        }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        Sum(num,0);
        // int res = Sum(0,num);
        // System.out.println(res);
         s.close();
    }
}
