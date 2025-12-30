import java.util.Scanner;
public class R2PrintNumBackTracking {
     static void Num(int i,int n){
        if(i<1){
            return;
        }
        else{
            Num(i-1,n);
            System.out.println(i);
        }
     }
     public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        Num(num,num);
        s.close();
     }
}
