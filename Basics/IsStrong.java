package Basics;
public class IsStrong {
    public static void main(String[] args) {
        int num = 145;
        int originalNum = num;
        int sum = 0;
        int[] facts = new int[10];
        facts[0] = 1;
        facts[1] = 1;
        for(int i = 2; i < 10; i++){
            facts[i] = facts[i - 1] * i;
        }

        while(num > 0){
            int digit = num % 10;
            sum += facts[digit];
            num /= 10;
        }
        System.out.println(sum);
        if(sum == originalNum){
            System.out.println(originalNum + " is a Strong Number");
        } else {
            System.out.println(originalNum + " is not a Strong Number");
        }
    }
}

// Strong Number: A number in which the sum of the factorial of each digit is equal to the original number.