package Basics;

public class SumOfPrimeFactors {
    public static void main(String[] args) {
        int n = 100;
        int sum = 0;
        boolean once = false;
        while(n % 2 == 0){
            if(!once){
                sum += 2;
                once = true;
            }
            // System.out.println(2);
            n /= 2;
        }
        for(int i = 3; i <= Math.sqrt(n); i+= 2){
            boolean isOnce = false;
            while(n % i == 0){
                if(!isOnce){
                    sum += i;
                    isOnce = true;
                }
                n /= i;
                // System.out.println(i);
            }
        }

        if(n > 2){
            sum += n;
            System.out.println(n);
        }
        System.out.println("the sum is :");
        System.out.println(sum);
    }
}
