package Basics;

public class ArmStrongRange {
    public static void main(String[] args) {
        int low = 100;
        int high = 2000;
        for(int i = low; i <= high; i++){
            if(isArmstrong(i)){
                System.out.print(i + " ");
            }
        }
    }
    private static boolean isArmstrong(int n){
        int original = n;
        int sum = 0;
        int len = String.valueOf(n).length();
        while(n > 0){
            int digit = n % 10;
            sum += Math.pow(digit, len);
            n /= 10;
        }
        return sum == original;
    }
}
