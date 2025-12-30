public class sub {
    public static int getMinSum(int[] arr) {
        int n = arr.length;
        if (n < 3) return -1;

        int[] leftMin = new int[n];
        int[] rightMin = new int[n];
        int minSum = Integer.MAX_VALUE;

        leftMin[0] = Integer.MAX_VALUE;
        for (int i = 1; i < n; i++) {
            leftMin[i] = Math.min(leftMin[i - 1], arr[i - 1]);
        }

        rightMin[n - 1] = Integer.MAX_VALUE;
        for (int i = n - 2; i >= 0; i--) {
            rightMin[i] = Math.min(rightMin[i + 1], arr[i + 1]);
        }

        for (int i = 1; i < n - 1; i++) {
            if (leftMin[i] < arr[i] && arr[i] > rightMin[i]) {
                int currentSum = leftMin[i] + arr[i] + rightMin[i];
                minSum = Math.min(minSum, currentSum);
            }
        }

        return minSum == Integer.MAX_VALUE ? -1 : minSum;
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 1, 9, 3, 1};
        System.out.println(getMinSum(arr));
    }
}
