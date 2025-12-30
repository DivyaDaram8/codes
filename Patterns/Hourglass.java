package Patterns;

import java.util.Scanner;

public class Hourglass {
    // public static void main(String[] args) {
    //     Scanner s = new Scanner(System.in);
    //     System.out.println("Enter the number of rows: ");
    //     int n = s.nextInt();
    //     for(int i = 0; i < n; i++){
    //         for(int j = 0; j < i; j++){
    //             System.out.print(" ");
    //         }
    //         for(int k = i; k < n; k++){
    //             System.out.print(k + 1 + " ");
    //         }
    //         System.out.println();
    //     }
    //     for(int i = n - 1; i > 0; i--){
    //         for(int j = i - 1; j > 0; j--){
    //             System.out.print(" ");
    //         }
    //         for(int k = i; k <= n; k++){
    //             System.out.print(k + " ");
    //         }
    //         System.out.println();
    //     }
    //     s.close();
    // }
    public static void main(String[] args) {
        int n = 5;
        int spaces = -1;
        int num = n;
        int val = 0;
        for(int i = 0; i < 2 * n - 1; i++){
            if(i < n){
                spaces++;
                val++;
            }else{
                spaces--;
                val--;
            }
            for(int j = 0; j < spaces; j++){
                System.out.print(" ");
            }
            for(int j = val; j <= num; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
