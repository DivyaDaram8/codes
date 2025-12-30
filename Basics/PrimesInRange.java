package Basics;
public class PrimesInRange {
    public static void main(String[] args) {
        int low = 2;
        int high = 100;
        for(int i = low; i <= high; i++){
            if(isPrime(i)){
                System.out.print(i+ " ");
            }
        }
    }
    private static boolean isPrime(int n){
        if(n <= 1){
            return false;
        }
        else if(n == 2){
            return true;
        }else if(n % 2 == 0){
            return false;
        }else{
            for(int i = 3; i <= Math.sqrt(n); i += 2){
                if(n % i == 0){
                    return false;
                }
            }
        }
        return true;
    }
}
