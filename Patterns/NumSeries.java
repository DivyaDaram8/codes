package Patterns;

import java.util.Scanner;

public class NumSeries {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = s.nextInt();
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n - i; j++){
                System.out.print(" ");
            }
            for(int k = 0; k < i; k++){
                System.out.print(k + i);
            }
            for(int l = i - 1; l >= 1; l--){
                System.out.print(i + l - 1);
            }
            System.out.println();
        }
        s.close();
    }
}
