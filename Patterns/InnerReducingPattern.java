package Patterns;
import java.util.Scanner;

public class InnerReducingPattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = s.nextInt();
        int size = 2 * n - 1;
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                int top = i; 
                int left = j;
                int right = size - 1 - j;
                int bottom = size - 1 - i;
                int min = Math.min(Math.min(top, bottom), Math.min(left, right));
                System.out.print((n - min) + " ");
            }
            System.out.println();
        }
        s.close();
    }
}
