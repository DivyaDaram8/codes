package Cognizant;

import java.util.Scanner;

public class Basics {
    public static void main(String[] vals){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the value: ");
        n = sc.nextInt();
        System.out.println(n);
        System.out.println(n + " " + n + n);
        int sum = n + n;
        System.out.println(sum);
        // System.out.println((n + n));



        sc.close();
    }
}
