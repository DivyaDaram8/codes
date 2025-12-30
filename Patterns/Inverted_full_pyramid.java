package Patterns;
import java.util.Scanner;

public class Inverted_full_pyramid {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = s.nextInt();
        for(int i = 1; i <= n; i++){
            for(int j = 1; j < i; j++){
                System.out.print(" ");
            }
            for(int k = 0; k <= 2 * n - 2 * i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        s.close();
    }
}
