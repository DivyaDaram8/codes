import java.util.Scanner;
public class EuclideanGCD {
    public static int FindGcd(int a,int b){
        while(a > 0 && b > 0){
            if(a >b){
                a = a%b;
            }
            else{
                b = b%a;
            }
        }
        if(a == 0){
            return b;
        }
        else{
            return a;
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num1=s.nextInt();
        int num2=s.nextInt();
        int gcd= FindGcd(num1,num2);
        System.out.println("Gcd is: "+gcd);
        s.close();
    }
}
