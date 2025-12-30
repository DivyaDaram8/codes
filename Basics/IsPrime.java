package Basics;

public class IsPrime {
    public static void main(String[] args) {
        int n = 18;
        if(n <= 1){
            System.out.println(n + " is not a prime number.");
        }
        else if(n == 2){
            System.out.println(n + " is a prime number.");
        }else if(n % 2 == 0){
            System.out.println(n + " is not a prime number.");
        }else{
            boolean isPrime = true;
            for(int i = 3; i <= Math.sqrt(n); i += 2){
                if(n % i == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.println(n + " is a prime number.");
            }else{
                System.out.println(n + " is not a prime number.");
            }
        }
    }
}
