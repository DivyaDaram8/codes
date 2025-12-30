import java.util.Scanner;
public class R2PrintNum {
 static void Num(int i,int num){
    if(i > num){
        return;
    }
    else{
        System.out.println(i);
    }
    Num(i+1,num);
 }   
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        System.out.println("The numbers are: ");
        Num(1,num);
        s.close();
    }
}
