package Basics;
import java.util.Arrays;

public class Fibo {
    public static void main(String[] args) {
        int n = 10;
        // Method 1: Iterative approach
        int a = 0;
        int b = 1;
        for(int i = 0; i < n; i++){
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }

        // Method 2: Recursive approach
        System.out.println();
        for(int i = 0; i < n; i++){
            System.out.print(fibHelper(i) + " ");
        }

        System.out.println();
        
        // Method 3: Using Dynamic Programming (Memoization)
        int[] memo = new int[n + 1];
        Arrays.fill(memo, -1);
        for(int i = 0; i < n; i++){
            System.out.print(fibDP(i, memo) + " ");
        }



        //Method 4: Using DP Tabulation
        System.out.println();   
        int[] tab = new int[n];
        tab[0] = 0;
        tab[1] = 1;
        for(int i = 2; i < n; i++){
            tab[i] = tab[i - 1] + tab[i - 2];
        }
        for(int i = 0; i < n; i++){
            System.out.print(tab[i] + " ");
        }

    }

    
    // Method 2 function: Recursive approach
    public static int fibHelper(int n){
        if(n <= 1){
            return n;
        }
        return fibHelper(n - 1) + fibHelper(n - 2);
    }


    // Method 3: Using Dynamic Programming (Memoization)
    public static int fibDP(int n, int[] memo){
        if(n <= 1){
            return n;
        }
        if(memo[n] != -1){
            return memo[n];
        }
        memo[n] = fibDP(n - 1, memo) + fibDP(n - 2, memo);
        return memo[n];
    }
    
}
