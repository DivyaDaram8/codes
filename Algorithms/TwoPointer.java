package Algorithms;

public class TwoPointer {
    public static void main(String[] args){
        int[] arr = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29};
        int target = 32;
        int[] result = twoSum(arr, target);
        if(result[0] == -1 && result[1] == -1){
            System.out.println("No such elements found");
        }else{
            System.out.println("Elements found at indices: " + result[0] + " and " + result[1]);
        }
    }
    public static int[] twoSum(int[] arr, int target){
        int left = 0;
        int right = arr.length - 1;
        while(left < right){
            int sum = arr[left] + arr[right];
            if(sum == target){
                return new int[]{left, right};
            }else if(sum < target){
                left++;
            }else{
                right--;
            }
        }
        return new int[]{-1, -1};
    }
}

// This code defines a TwoPointer class that contains a method to find two elements in a sorted array that sum up to a given target using the two-pointer technique.
// The main method demonstrates the functionality by searching for two numbers that add up to 32 in a predefined sorted array.
