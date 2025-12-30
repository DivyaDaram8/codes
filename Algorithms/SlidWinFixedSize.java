package Algorithms;

public class SlidWinFixedSize {
    public static void main(String[] args) {
        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        int maxSum =slidingWindowMax(arr, k);
        System.out.println("Maximum sum of a subarray of size " + k + " is: " + maxSum);
    }
    public static int slidingWindowMax(int[] arr, int k){
        int n = arr.length;
        int winSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            winSum += arr[i];
            if(i >= k - 1){
                maxSum = Math.max(maxSum, winSum);
                winSum -= arr[i - (k - 1)]; // if i = 2, to remove arr[0], i - (k - 1) = 2 - 2 = 0
            }
        }
        return maxSum;
    }
}


// The above code demonstrates sliding window technique to find the maximum sum of a subarray of fixed size k.
// It maintains a running sum of the current window and updates the maximum sum found as it slides the window across the array.


// This fixed sized sliding window approach is efficient with a time complexity of O(n) since each element is added and removed from the window exactly once.
// The space complexity is O(1) as it uses a constant amount of extra space regardless of the input size.
// It is used in scenarios like finding maximum/minimum sums, averages, or other aggregate values over a fixed-size subset of data in a larger dataset.
// Also used for subarray / contiguous / substring problems where the size of the subset is predetermined.
// Contiguous means elements that are next to each other without any gaps.