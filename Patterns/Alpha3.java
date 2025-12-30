package Patterns;

public class Alpha3 {
    public static void main(String[] args) {
        for(int i = 0; i < 5; i++){
            for(int j = 0; j <= i; j++){
                char ch = (char)('A' + j);
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}

// A 
// A B 
// A B C 
// A B C D 
// A B C D E 