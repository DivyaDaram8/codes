package Basics;

public class IsAutoMorphic {
    public static void main(String[] args) {
        int n = 25;
        int sq = n * n;
        int temp = n;
        boolean isAutoMorphic = false;
        while(temp > 0){
            if(temp % 10 == sq % 10){
                isAutoMorphic = true;
            }else {
                isAutoMorphic = false;
                break;
            }
            temp /= 10;
            sq /= 10;
        }
        if(isAutoMorphic){
            System.out.println(n + " is an Automorphic Number");
        } else {
            System.out.println(n + " is not an Automorphic Number");
        }

    }
}

// Automorphic Number: square of a given number should end with the same digits as the number itself.