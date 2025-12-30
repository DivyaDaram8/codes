package Basics;

public class IsHarshad {
    public static void main(String[] args) {
        int n = 20;
        int sum = 0;
        int temp = n;
        while(temp > 0){
            sum += temp % 10;
            temp /= 10;
        }
        if(n % sum == 0){
            System.out.println(n + " is a Harshad Number");
        } else {
            System.out.println(n + " is not a Harshad Number");
        }
    }
}

// Harshad Number: A number that is divisible by the sum of its digits.