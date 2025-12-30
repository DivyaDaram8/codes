package Cognizant;

import java.util.Scanner;

public class String2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a;

        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        
        System.out.println("Enter a value");
        a = sc.next();

        System.out.println("Values are: ");
        System.out.println(str);
        System.out.println(a);
        System.out.println((str + a));
        sc.close();
    }
}
