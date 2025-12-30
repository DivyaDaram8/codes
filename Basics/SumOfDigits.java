package Basics;

public class SumOfDigits {
    public static void main(String[] args) {
        int n = 12345;
        int temp = n;
        int sum = 0;
        while(n > 0){
            sum += n % 10;
            n /= 10;
        }
        System.out.println("Sum of digits of " + n + " is: " + sum);
        System.out.println(sum(0, temp));
        System.out.println(sum1(temp));
    }
    //way 2
    private static int sum(int val, int n){
        if(n == 0){
            return val;
        }
        val += n % 10;
        return sum(val, n / 10);
        
    }
    //way 3 
    private static int sum1(int n){
        if(n == 0){
            return 0;
        }
        return n % 10 + sum1(n / 10);
    }

}
