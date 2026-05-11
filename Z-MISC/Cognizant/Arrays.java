package Cognizant;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n;
        n = s.nextInt();

        int[] arr;
        arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = s.nextInt();
        }

        System.out.println("The values are: ");

        for(int i = 0; i < n; i++){
            System.out.println(arr[i]);
        }
        s.close();
    }
}
