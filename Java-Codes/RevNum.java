
import java.util.Scanner;
public class RevNum {
  

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int rem,rev=0;
        while(n>0){
            rem=n%10;
            rev=(rev*10)+rem;
            n=n/10;
        }
            System.out.print(rev);
            s.close();
    }   
}

