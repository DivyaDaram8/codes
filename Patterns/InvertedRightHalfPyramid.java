package Patterns;

import java.util.Scanner;

public class InvertedRightHalfPyramid {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = s.nextInt();
        for(int i = n; i > 0; i--){
            for(int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        s.close();
    }
}
