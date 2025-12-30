package Patterns;

public class Bridge {
    public static void main(String[] args) {
        int n = 5;
        for(int i = n; i > 0; i--){
            for(int j = 0; j < i; j++){
                System.out.print((char)('A' + j));
            }
            for(int j = 0; j < n - i; j++){
                System.out.print(" ");
            }
            for(int j = 0; j < n - i - 1; j++){
                System.out.print(" ");
            }
            for(int j = i; j > 0; j--){
                if(j != n){
                    System.out.print((char)('A' + j - 1));
                }
            }   
            System.out.println();
        }
    }
}


// ABCDEDCBA
// ABCD DCBA
// ABC   CBA
// AB     BA
// A       A