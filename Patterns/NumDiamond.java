package Patterns;
import java.util.Scanner;
public class NumDiamond {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = s.nextInt();
        int part1 = n / 2 + 1;
        for(int i = 1; i <= part1; i++){
            for(int j = 1; j <= part1 - i; j++){
                System.out.print(" ");
            }
            for(int k = i; k >= 1; k--){
                System.out.print(k);
            }
            for(int l = 2; l <= i; l++){
                System.out.print(l);
            }
            System.out.println();
        }
        int part2 = n / 2;
        for(int i = part2; i > 0; i--){
            for(int j = 0; j <= part2 - i; j++){
                System.out.print(" ");
            }
            for(int k = i; k > 0; k--){
                System.out.print(k);
            }
            for(int l = 2; l <= i; l++){
                System.out.print(l);
            }
            System.out.println();
        }
        s.close();
    }
}
