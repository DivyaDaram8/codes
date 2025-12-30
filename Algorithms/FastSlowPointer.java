package Algorithms;


public class FastSlowPointer {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5};
        int newLength = removeDuplicates(arr);
        System.out.println("Array after removing duplicates:");
        for(int i = 0; i < newLength; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nNew length: " + newLength);
    }
    public static int removeDuplicates(int[] arr){
        int len =  arr.length;
        if(len == 0) return 0;
        int slow = 0;
        for(int fast = 1; fast < len; fast++){
            if(arr[fast] != arr[slow]){
                slow++;
                arr[slow] = arr[fast];
            }
        }
        return slow + 1;
    }
}


// The above code demonstrates removing of duplicates from the array using fast and slow pointer approach.
