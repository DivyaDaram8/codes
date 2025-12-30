import java.util.Scanner;
public class R3SumReFunc {
    public static int sum( int num){
        if(num == 0){
            return 0;
        }
        else{
            return num+ sum(num-1);
        }
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int Res= sum(num);
        System.out.println(Res);
        s.close();
    }
}
