import java.util.Scanner;
public class Re3FactRE {
    static int Fact(int num){
        if(num == 1){
            return 1;
        }
        else{
            return num * Fact(num-1);
        }
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.print(Fact(n));
        s.close();
    }
}
//tc is O(n)
//sc is O(n) it takes stack space