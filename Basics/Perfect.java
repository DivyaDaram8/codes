package Basics;

public class Perfect {
    public static void main(String[] args) {
        int n = 15;
        int sum = 0;
        for(int i = 1; i < Math.sqrt(n); i++){
            if(n % i == 0){
                sum += i;
                // i != 1 is to avoid adding n itself
                if(i != 1 && i != n / i){
                    sum += n / i;
                }
            }
        }   
        if(sum == n){
            System.out.println(n + " is a Perfect Number");
        } else {
            System.out.println(n + " is not a Perfect Number");
        }   
    }
}

// Perfect Number: A number that is equal to the sum of its proper divisors.