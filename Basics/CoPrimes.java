package Basics;

public class CoPrimes {
    public static void main(String[] args) {
        int a = 15;
        int b = 5;
        if(gcd(a, b) == 1){
            System.out.println(a + " and " + b + " are Co-Primes.");
        }else{
            System.out.println(a + " and " + b + " are not Co-Primes.");
        }
    }
    public static int gcd(int a, int b){
        if(b == 0){
            return a;
        }else{
            return gcd(b, a % b);
        }
    }
}
// Co-Primes are two numbers whose GCD (Greatest Common Divisor) is 1.