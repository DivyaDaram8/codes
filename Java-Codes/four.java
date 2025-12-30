import java.util.*;
public class four {
    public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter num :");
            int num =s.nextInt();
            int count = 0;
            while(num > 0){
                int unitDigit = num % 10;
                if(unitDigit == 4){
                    count++;
                }
                num = num / 10;
            }
            System.out.println(count);
        s.close();
    }
}
