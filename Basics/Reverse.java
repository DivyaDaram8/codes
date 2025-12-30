package Basics;

public class Reverse {
    public static void main(String[] args) {
        int n = 120;
        int temp = n;
        int rev = 0;
        while(n > 0){
            int rem = n % 10;
            rev = rev * 10 + rem;
            System.out.print(rem);
            n /= 10;
        }
        System.out.println();
        System.out.println(rev);


        //way 2
        StringBuilder sb = new StringBuilder(String.valueOf(temp));
        sb.reverse();
        sb.toString();
        System.out.println(sb); 
    }
}
