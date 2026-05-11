import java.util.Scanner;
public class R2NumRevBT {
     static void Num(int i,int n){
        if(i > n){
            return;
        }
        else{
            Num(i+1,n);
            System.out.println(i);
        }
     }
     public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        System.out.println("The numbers are: ");
        Num(1,num);
        s.close();
     }
}

