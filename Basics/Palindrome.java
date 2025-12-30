package Basics;

public class Palindrome {
    public static void main(String[] args) {
        int n = 120;
        int temp = n;
        int rev = 0;
        while(temp > 0){
            int rem = temp % 10;
            rev = rev * 10 + rem;
            temp /= 10;
        }
        if(rev == n){
            System.out.println("" + n + " is a palindrome number");
        }else{
            System.out.println( n +" is not palindrome");
        }
    }
}
