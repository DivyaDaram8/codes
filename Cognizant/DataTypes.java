package Cognizant;
import java.util.*;

public class DataTypes {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n;
        String ch;
        float f;
        long l;
        double d; 

        n = s.nextInt();
        s.nextLine();
        ch = s.nextLine();
        f = s.nextFloat();
        l = s.nextLong();
        d = s.nextDouble();

        System.out.println(f);
        System.out.println(n);
        System.out.println(ch);
        System.out.println(l);
        System.out.println(d);


        s.close();
    }
}
