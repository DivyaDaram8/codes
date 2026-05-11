import java.util.Scanner;
public class R2PrintNumRev {
    static void NumPrint(int i,int num){
        if(num < i){
            return;
        }
        else{
            System.out.println(num);
        }
        NumPrint(i,num-1);

    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        NumPrint(1,n);//also can pass NumPrint(n,n),but in if in func change the condition 
        s.close();
    }
}
