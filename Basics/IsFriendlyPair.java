package Basics;

public class IsFriendlyPair {
    public static void main(String[] args) {
        int a = 6;
        int b = 28;

        int sumA = divisorsSum(a);
        int sumB = divisorsSum(b);
        double n1 = (double)sumA / a;
        double n2 = (double)sumB / b;
        if(n1 == n2){
            System.out.println(a + " and " + b + " are Friendly Pairs");
        }else{
            System.out.println(a + " and " + b + " are not Friendly Pairs");
        }
    }
    public static int divisorsSum(int n){
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
        return sum;
    }
}

// Friendly Pair: Two numbers are said to be Friendly Pairs if the ratio of the sum of their proper divisors to the number itself is the same for both numbers.