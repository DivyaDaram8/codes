package Basics;

public class Armstrong {
    public static void main(String[] args) {
        int n = 1634;
        int temp = n;
        int len = (int) Math.log10(n) + 1;
        int sum = 0;

        while(n > 0){
            int rem = n % 10;
            sum += Math.pow(rem, len);
            n /= 10;
        }
        if(sum == temp){
            System.out.println(temp + " is an Armstrong number.");
        }else{
            System.out.println(temp + " is not an Armstrong number.");
        }
    }  
}
