package Basics;
import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = s.nextInt();
        System.out.println(sum(n));
        s.close();
    }
    public static int sum(int n){
        if(n == 1){
            return 1;
        }else{
            return n + sum(n - 1);
        }
    }
}