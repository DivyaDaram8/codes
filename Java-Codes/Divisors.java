import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Divisors {
    public static void main(String[] args) {
        int number = 36;
        List<Integer> divisors = findDivisors(number);

        System.out.println("Divisors of " + number + " in order are: " + divisors);
    }

    public static List<Integer> findDivisors(int number) {
        List<Integer> divisors = new ArrayList<>();

        for (int i = 1; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                divisors.add(i);
                // Add the complementary divisor if it's different
                if (i != number / i && number / i != number) {
                    divisors.add(number / i);
                }
            }
        }

        Collections.sort(divisors);
        return divisors;
    }
}
