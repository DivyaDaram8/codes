package Basics;

public class PrimeFactors {
    public static void main(String[] args) {
        int n = 99;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n /= i;
            }
        }   
        if (n > 1) {
            System.out.print(n);
        }


        // Optimized approach for large numbers
        System.out.println();
        n = 16;
        while(n % 2 == 0){
            System.out.print(2 + " ");
            n /= 2;
        }
        for(int i = 3; i <= Math.sqrt(n); i += 2){ 
            while(n % i == 0){
                System.out.print(i + " ");
                n /= i;
            }
        }
        if(n > 2){
            System.out.print(n);
        } // used for edge case, example n = 17
    }
}
// check only odd numbers and sqrt(n) is used because a larger factor of n must be a multiple of smaller factor that has been already checked, for example: 36 = 4 * 9, here 4 is smaller factor and 9 is larger factor, so if we check till sqrt(36) i.e. 6, we will cover all smaller factors. 