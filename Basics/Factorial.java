package Basics;

public class Factorial {
    public static void main(String[] args) {
        int n = 5;
        System.out.println("Factorial of " + n + " is: " + factorial(n));

    }
    // private static int factorial(int n){
    //     if( n == 0){
    //         return 1;
    //     }
    //     return n * factorial(n - 1);    
    // }

    // Memoization (Top Down Approach)
    // private static int[] dp = new int[100];
    // private static int factorial(int n){
    //     if( n == 0){
    //         return 1;
    //     }
    //     if(dp[n] != 0){
    //         return dp[n];
    //     }
    //     dp[n] = n * factorial(n - 1);
    //     return dp[n];
    // }

    //brute force
    // private static int factorial(int n){
    //     int fact = 1;
    //     for(int i = 1; i <= n; i++){
    //         fact = fact * i;
    //     }
    //     return fact;

    // Tabulation(Bottom Up Approach)
    private static int factorial(int n){
        int[] dp = new int[n + 1];
        dp[0] = 1;
        for(int i = 1; i <= n; i++){
            dp[i] = dp[i - 1] * i;
        }
        return dp[n];
    }
}
