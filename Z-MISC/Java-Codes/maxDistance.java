import java.util.Scanner;

public class maxDistance{ // Class name matches the file name
    public static int maxDist(int[] colors) {
        // Main solution
        int dist1 = 0, dist2 = 0, start = 0, end = colors.length - 1;
        while (start <= end) {
            if (colors[start] != colors[end]) {
                dist1 = end - start;
                break;
            }
            end--;
        }
        start = 0;
        end = colors.length - 1;
        while (start <= end) {
            if (colors[start] != colors[end]) {
                dist2 = end - start;
                break;
            }
            start++;
        }
        return Math.max(dist1, dist2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // User input for array size
        System.out.print("Enter the number of colors: ");
        int n = sc.nextInt();

        // User input for array elements
        int[] colors = new int[n];
        System.out.println("Enter the colors (integers): ");
        for (int i = 0; i < n; i++) {
            colors[i] = sc.nextInt();
        }

        // Call the function and print result
        int result = maxDist(colors);
        System.out.println("Maximum Distance: " + result);

        sc.close();
    }
}
