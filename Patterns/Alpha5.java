package Patterns;

public class Alpha5 {
    public static void main(String[] args) {
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5 - i; j++){
                char ch = (char)('A' + i);
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
// AAAAA
// BBBB
// CCC
// DD
// E