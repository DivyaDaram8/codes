package Basics;

public class Power {
    public static void main(String[] args) {
        int base = 5;
        int power = 3;
        int res = 1;
        while(power-- > 0){
            res *= base;
        }
        System.out.println(res);
        System.out.println((int)power(base, 3));
        // upto only 3 decimals
        System.out.println(String.format("%.3f", power(base, 3)));
        System.out.println(power(base, -2) );
    }
    private static double power(double base, double power){
        if(power == 0){
            return 1;
        }else{
            if(power < 0){
                return 1 / base * power(base, power + 1);
            }else{
                return base * power(base, power - 1);
            }
        }
    }

}
