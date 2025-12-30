import java.util.Scanner;

public class MaximumDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for the size of the array
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        // Taking input for the array elements
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        // Uncomment the logic you want to use

        // Logic 1: Brute force
        /*
        int sum = -1;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] < nums[j]) {
                    sum = Math.max(sum, nums[j] - nums[i]);
                }
            }
        }
        System.out.println("Maximum Difference: " + sum);
        */

        // Logic 2: Optimized with tracking minimum
        /*
        int sum = -1;
        int mini = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (mini < nums[i]) {
                sum = Math.max(sum, nums[i] - mini);
            }
            mini = Math.min(mini, nums[i]);
        }
        System.out.println("Maximum Difference: " + sum);
        */

        // Logic 3: Optimized with inline min tracking
        int min = Integer.MAX_VALUE;
        int diff = -1;
        for (int i : nums) {
            if (i <= min) {
                min = i;
            } else {
                diff = Math.max(diff, i - min);
            }
        }
        System.out.println("Maximum Difference: " + diff);

        // Closing the scanner
        scanner.close();
    }
}
