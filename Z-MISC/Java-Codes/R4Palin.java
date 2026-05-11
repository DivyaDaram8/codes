import java.util.Scanner;
//did using functions but not with recursion
public class R4Palin {
    // static int Palin(String name){
        // for(int i=0;i<name.length()/2; i++){
        //     if(name.charAt(i) != name.charAt((name.length())-1-i)){
        //         return 0;
        //     }
            
        // }
        // return 1;
        static boolean Palin(int start,String name){
            if(start > name.length()/2){
                return true;
            }
            if(name.charAt(start) != name.charAt(name.length()-1-start)){
                return false;
            } 
            return Palin(start+1,name);
        }
// }
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        String name=s.nextLine();
        boolean res=Palin(0,name);
        if(res == true){
            System.out.println("A Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
                // int res =Palin(name);
        // if(res == 1){
        //     System.out.println("A Palindrome");
        // }
        // else{
        //     System.out.println("Not a palindrome");
        // }
        s.close();

    }
}
// time complexity is O(n)
//space complexity is O(n)