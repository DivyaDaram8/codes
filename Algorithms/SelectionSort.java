package Algorithms;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        selectionSortMax(arr);
        System.out.println("Sorted array:");
        for(int num : arr){
            System.out.print(num + " ");
        }   
    }
    public static void selectionSort(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n - 1; i++){
            int minIdx = i;
            for(int j = i + 1; j < n; j++){
                if(arr[minIdx] > arr[j]){
                    minIdx = j;
                }
            }
            if(minIdx != i){
                int temp = arr[i];
                arr[i] = arr[minIdx];
                arr[minIdx] = temp;
            }
        }
    }
    public static void selectionSortMax(int[] arr){
        int n = arr.length - 1;
        for(int i = n; i > 0; i--){
            int maxIdx = i;
            for(int j = i - 1; j >= 0; j--){
                if(arr[maxIdx] < arr[j]){
                    maxIdx = j;
                }
            }
            int temp = arr[maxIdx];
            arr[maxIdx] = arr[i];
            arr[i] = temp;
        }
    }
}
