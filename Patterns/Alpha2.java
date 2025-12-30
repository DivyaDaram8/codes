package Patterns;

public class Alpha2 {
    public static void main(String[] args) {
        for(int i = 5; i > 0; i--){
            for(int j = 0; j < i; j++){
                char ch = (char)('A' + i - 1);
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}


// EEEEE
// DDDD
// CCC
// BB
// A