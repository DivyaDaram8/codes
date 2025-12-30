package Patterns;
import java.util.Scanner;
public class Letter_A {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = s.nextInt();
        for(int i = 0; i < n; i++){
            if(i == 0){
                for(int j = 0; j <= n / 2 - 1; j++){
                    if(j == 0){
                        System.out.print(" ");
                    }else{
                        System.out.print("*");
                    }
                }
                System.out.println();
            }
            else if(i == n / 2){
                for(int k = 0; k <= n / 2; k++){
                    System.out.print("*");
                }
                System.out.println();
            }
            else{
                for(int l = 0; l <= n / 2; l++){
                    if(l == 0 || l == n / 2){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }   
                }
                System.out.println();
            }
        }
        s.close();
    }
}

//  ***
// *   *
// *   *
// *   *
// *****
// *   *
// *   *
// *   *