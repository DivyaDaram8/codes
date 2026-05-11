import java.util.*;
public class RPrintName {
    static void Name(int i,int num){
        if(i > num){
            return;
        }
        else{
            System.out.println("Hello");
        }
        Name(i+1,num);

    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        Name(1,n);
        s.close();

    }
}
//time complexity : O(n)
//space complexity : O(n)