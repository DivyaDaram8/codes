package Patterns;

import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = s.nextInt();
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n - i; j++){
                System.out.print(" ");
            }
            for(int k = 1; k <= i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i = n; i > 0; i--){
            for(int j = n - i; j > 0; j--){
                System.out.print(" ");
            }
            for(int k = i; k > 0; k--){
                System.out.print("* ");
            }
            System.out.println();
        }
        s.close();
    }
}
//    * 
//   * * 
//  * * * 
// * * * * 
// * * * *
//  * * *
//   * * 
//    *