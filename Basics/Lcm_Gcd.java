package Basics;

public class Lcm_Gcd {
    public static void main(String[] args) {
        int a = 2;
        int b = 5;
        System.out.println("GCD of " + a + " and " + b + " is: " + gcd(a, b));
        System.out.println("LCM of " + a + " and " + b + " is: " + lcm(a, b));
    }
    public static int gcd(int a, int b){
        if(b == 0){
            return a;
        }else{
            return gcd(b, a % b);
        }
    }
    public static int lcm(int a, int b){
        return (a * b) / gcd(a, b);
    }
}
