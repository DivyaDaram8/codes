package Patterns;

public class Alpha4 {
    public static void main(String[] args) {
        for(int i = 0; i < 5; i++){
            for(int j = i; j >= 0; j--){
                char ch = (char)('A' + 5 - j - 1);
                System.out.print(ch);
            }
            System.out.println();
        }
        for(int i = 0; i < 5; i++){
            for(int j = 0; j <= i; j++){
                char ch = (char)('A' + 4 - i + j);
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}

// E 
// D E 
// C D E 
// B C D E 
// A B C D E 