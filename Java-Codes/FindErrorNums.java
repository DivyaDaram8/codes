import java.util.Scanner;
import java.util.HashSet;

public class FindErrorNums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input array from the user
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        // Uncomment to use the first logic
        /*
        int[] result1 = findErrorNumsUsingSet(nums);
        System.out.println("First Logic Output:");
        System.out.println("Repeated: " + result1[0] + ", Missing: " + result1[1]);
        */

        // Using the second (optimal) logic
        int[] result2 = findErrorNumsUsingFrequency(nums);
        System.out.println("Optimal Logic Output:");
        System.out.println("Repeated: " + result2[0] + ", Missing: " + result2[1]);

        scanner.close();
    }

    // First logic using HashSet
    public static int[] findErrorNumsUsingSet(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        int repeated = -1;
        int missing = -1;

        for (int num : nums) {
            if (hs.contains(num)) {
                repeated = num;
            }
            hs.add(num);
        }
        for (int i = 1; i <= nums.length; i++) {
            if (!hs.contains(i)) {
                missing = i;
            }
        }

        return new int[]{repeated, missing};
    }

    // Second logic using frequency array
    public static int[] findErrorNumsUsingFrequency(int[] nums) {
        int n = nums.length;
        int[] frequency = new int[n + 1]; 
        int repeated = -1;
        int missing = -1;

        // Count the frequency of each number
        for (int num : nums) {
            frequency[num]++;
        }

        // Identify repeated and missing numbers
        for (int i = 1; i <= n; i++) {
            if (frequency[i] == 2) {
                repeated = i;
            } else if (frequency[i] == 0) {
                missing = i;
            }
        }

        return new int[]{repeated, missing};
    }
}
