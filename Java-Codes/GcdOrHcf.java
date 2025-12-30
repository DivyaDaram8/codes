import java.util.Scanner;
public class GcdOrHcf {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num1 = s.nextInt();
        int num2 = s.nextInt();
        for(int i =Math.min(num1,num2);i>=1;i--){
            if(num1 % i == 0 && num2 % i == 0){
                System.out.println("Gcd is: "+i);
                break;
            }
     
        }
        s.close();
    }
}
