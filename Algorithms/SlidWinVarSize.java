package Algorithms;

public class SlidWinVarSize {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 9};
        int targetSum = 9;
        int result = findMinSubarrayWithSum(arr, targetSum);
        if(result != -1){
            System.out.println("Subarray found with the given sum. Length: " + result);  
        }else{
            System.out.println("No subarray found with the given sum.");    
        }
    }
    public static int findMinSubarrayWithSum(int[] arr, int targetSum){
        int left = 0;
        int currentSum = 0;
        int len = 0;
        int minLen = Integer.MAX_VALUE;
        for(int right = 0; right < arr.length; right++){
            currentSum += arr[right];
            while(currentSum >= targetSum && left <= right){
                len = right - left + 1;
                minLen = Math.min(minLen, len);
                currentSum -= arr[left];
                left++;
            }
        }
        return minLen == Integer.MAX_VALUE ? -1 : minLen; // No subarray found
    }
}





// Sliding Window of Variable Size - Template
// 1. Initialize pointers and variables
// 2. Expand the window by moving the right pointer and updating the window's properties
// 3. While the window meets the desired condition, process the window (e.g., update result) and contract it by moving the left pointer
// 4. Repeat steps 2 and 3 until the right pointer reaches the end of the array
// Note: The specific condition and processing logic will depend on the problem being solved.
// This template can be adapted for problems like finding the smallest/largest subarray with a given sum, longest substring with unique characters, etc.
// Time Complexity: O(n) - Each element is processed at most twice (once by the right pointer and once by the left pointer)
// Space Complexity: O(1) - Only a constant amount of extra space is used