package Basics;

public class IsAbundant {
    public static void main(String[] args) {
        int n = 77;
        int sum = 0;
        for(int i = 1; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                sum += i;
                // i != 1 is to avoid adding n itself
                if(i != 1 && i != n / i){
                    sum += n / i;
                }
            } 
        }
        if(sum > n){
            System.out.println(n + " is an Abundant Number");
        } else {
            System.out.println(n + " is not an Abundant Number");
        }
    }
}

// Abundant Number: A number for which the sum of its proper divisors is greater than the number itself.