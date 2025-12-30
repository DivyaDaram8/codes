package Patterns;

public class Alphabets1 {
    public static void main(String[] args){
        for(int i = 0; i < 5; i++){
            for(int j = i; j < 5; j++){
                char ch = (char)('A' + j);
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}

// ABCDE
// BCDE
// CDE
// DE
// E