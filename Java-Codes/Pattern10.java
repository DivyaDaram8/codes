import java.util.*;
public class Pattern10 {
    public static void main(String[] args) {
    Scanner s =new Scanner(System.in);
    int num = s.nextInt();
    for(int i=0;i<num;i++){
        for(int j=num-i;j>1;j--){
            System.out.print(" ");
        }
        for(int j=0;j<num;j++){
            System.out.print("*");
        }
        System.out.println();
    }
        s.close();
    }
}
