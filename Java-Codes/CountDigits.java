import java.util.*;
public class CountDigits {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n= s.nextInt();
        int m=n;
        int cnt=0;
        int rem =0;
        while(n>0){
            rem=n%10;
            if(rem!= 0 && m % rem == 0)
            {
                cnt++;
            }
            n=n/10;
        }
        System.out.println(cnt);
        s.close();
        } 
    }
    

