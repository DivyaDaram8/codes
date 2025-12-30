package Patterns;

public class ButterFly {
    public static void main(String[] args) {
        int n = 5;
        int spaces = 2 * n - 1;
        int stars = 0;
        for(int i = 1; i <= 2 * n - 1; i++){
            if(i <= n){
                stars++;
                spaces -= 2;
            }else{
                stars--;
                spaces += 2;
            }
            for(int j = 1; j <= stars; j++){
                System.out.print("*");
            }
            for(int j = 1; j <= spaces; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= stars; j++){
                if(j != n){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
