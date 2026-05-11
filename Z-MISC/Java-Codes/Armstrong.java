import java.util.*;
public class Armstrong {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int num=s.nextInt();
        int num1=num;
        int rem,sum=0;
        int count=(int)(Math.log10(num)+1);

        while(num>0){
            rem=num%10;
            sum=sum+(int)(Math.pow(rem,count));
            num=num/10;
        }
        if(num1 == sum){
            System.out.println("It is a armstrong number");
        }else{
             System.out.println("It is not a armstrong number");
        }
        s.close();

 }
}

