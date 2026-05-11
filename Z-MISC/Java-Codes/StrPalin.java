import java.util.Scanner;
public class StrPalin {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        //String ans = "";
        // for(int i = str.length() -1; i >= 0; i--){
        //     ans = ans + str.charAt(i);
        // }
        // if(ans.equals(str)){
        //     System.out.println(" It is a palindrome: ");
        // }else{
        //     System.out.println("Not a palindrome");
        // }
        boolean isPalin = false;
        for(int i = 0; i < str.length() / 2; i++){
            if(str.charAt(i) != str.charAt(str.length() - i -1)){
                System.out.println("Not a palindrome");
                break;
            }
            else{
                isPalin = true;
            }
        }
        if(isPalin){
            System.out.println("palindrome");
        }
        
        s.close();
    }   
}
