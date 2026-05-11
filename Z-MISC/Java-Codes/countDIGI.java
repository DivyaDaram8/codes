
// class Solution{
//     static int evenlyDivides(int N){
//         int c =0;
//         String s= Integer.toString(N);
        
//         for(int i =0;i<s.length();i++){
//             char t =s.charAt(i);
//             if(t=='0'){
//                 continue;
//             }
//             int a =Integer.parseInt(String.valueOf(t));
//             if(N%a==0 ){
//             c++;
//                        }
//                            }
//         return c;
//         // code here
//     }
// }
import java.util.Scanner;

public class countDIGI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int N = scanner.nextInt();
        int result = evenlyDivides(N);
        System.out.println("The number of digits that evenly divide " + N + " is: " + result);
        scanner.close();
    }

    static int evenlyDivides(int N) {
        int count = 0;
        String s = Integer.toString(N);

        for (int i = 0; i < s.length(); i++) {
            char t = s.charAt(i);
            if (t == '0') {
                continue;
            }
            int a = Integer.parseInt(String.valueOf(t));
            if (N % a == 0) {
                count++;
            }
        }
        return count;
    }
}
