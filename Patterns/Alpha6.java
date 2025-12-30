package Patterns;

public class Alpha6 {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++){
            for(int j = i; j > 0; j--){
                char ch = (char)('A' + j - 1);
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
// A
// BA
// CBA
// DCBA
// EDCBA