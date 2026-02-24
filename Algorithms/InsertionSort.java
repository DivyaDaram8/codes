package Algorithms;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6};
        insertionSort(arr);
        System.out.println("Sorted array:");
        for(int num : arr){
            System.out.print(num + " ");
        }   
    }
    public static void insertionSort(int[] arr){
        int len = arr.length;
        for(int i = 1; i < len; i++){
            int key = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > key){
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key; 
        }
    }
}
