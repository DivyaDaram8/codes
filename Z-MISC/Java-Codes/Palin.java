import java.util.*;
public class Palin {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int n1=n,rem,rev=0;
        while(n>0){
            rem=n%10;
            rev=(rev*10)+rem;
            n=n/10;
        }
        if(n1==rev){
            System.out.println("It is a palindrome: "+rev);
        }
        else{
            System.out.println("It is not a palindrome");
        }
        s.close();
    }
    
}