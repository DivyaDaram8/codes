import java.util.Scanner;

public class ReplaceElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.println("Enter the size of the array:");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Call the replaceElements function
        int[] result = replaceElements(arr);

        // Display the result
        System.out.println("Array after replacement:");
        for (int num : result) {
            System.out.print(num + " ");
        }
        scanner.close();
    }

    // Function to replace elements
    public static int[] replaceElements(int[] arr) {
        int n = arr.length;
        int maxTemp = arr[n - 1];
        int temp;
        arr[n - 1] = -1;

        for (int i = n - 2; i >= 0; i--) {
            temp = arr[i];
            arr[i] = maxTemp;
            maxTemp = Math.max(temp, maxTemp);
        }
        return arr;
    }
}
