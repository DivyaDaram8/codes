package Algorithms;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {23, 45, 67, 12, 99, 8};
        bubbleSort(arr);
        // optimizedBubbleSort(arr);
        System.out.println("Eles after sorting");
        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }
    public static void bubbleSort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 1; j < arr.length - i; j++){
                if(arr[j - 1] > arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }
    public static void optimizedBubbleSort(int[] arr){
        boolean swapped;
        for(int i = 0; i < arr.length - 1; i++){
            swapped = false;
            for(int j = 1; j < arr.length - i; j++){
                if(arr[j - 1] > arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
}
