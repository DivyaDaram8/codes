package Basics;

public class Lcm {
    public static void main(String[] args) {
        int a = 2;
        int b = 5;
        int min = (a < b) ? a : b;
        int max = (a > b) ? a : b;
        for(int i = max; i <= a * b; i += max){
            if( i % min == 0){
                System.out.println("LCM of " + a + " and " + b + " is: " + i);
                return;
            }
        }
    }
}
 