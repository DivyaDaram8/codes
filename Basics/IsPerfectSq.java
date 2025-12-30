package Basics;

public class IsPerfectSq {
    public static void main(String[] args) {
        int n = 400;
        boolean isPerfectSq = false;
        for(int i = 1; i * i <= n; i++){
            if( i * i == n ){
                isPerfectSq = true;
                break;
            }
        }
        if(isPerfectSq){
            System.out.println(n + " is a perfect square");
        }else{
            System.out.println(n + " is not a perfect square");
        }
    }
}
