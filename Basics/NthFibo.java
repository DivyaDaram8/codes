package Basics;

import java.util.Arrays;

public class NthFibo {
    public static void main(String[] args) {
        int n = 10;
        int[] memo = new int[n];
        Arrays.fill(memo, -1);
        int result = fibo(n - 1, memo);
        System.out.println("The " + n + "th Fibonacci number is: " + result );
        System.out.println(Arrays.toString(memo));
        System.out.println(memo[n - 1]);
    }
    public static int fibo(int n, int[] memo){
        if(n <= 1){
            memo[n] = n;
            return n;
        }
        if(memo[n] != -1){
            return memo[n];
        }
        memo[n] = fibo(n - 1, memo) + fibo(n - 2, memo);
        return memo[n];
    }
}
