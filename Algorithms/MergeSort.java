package Algorithms;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {38, 27, 43, 3, 9, 82, 10};
        mergeSort(arr, 0, arr.length - 1);
        System.out.println("Sorted array:");
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
    public static void mergeSort(int[] arr, int left, int right){
        if(left < right){
            int mid = left + (right - left) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }
    public static void merge(int[] arr, int left, int mid, int right){
        int n1 = mid - left + 1; // size of left subarray
        int n2 = right - mid; // size of right subarray

        int[] l = new int[n1];
        int[] r = new int[n2];

        for(int i = 0; i < n1; i++){
            l[i] = arr[left + i]; // left half starts from left
        }
        for(int j = 0; j < n2; j++){
            r[j] = arr[mid + 1 + j]; // right half starts from mid + 1
        }

        int i = 0, j = 0;
        int k = left; // initial index of merged subarray as we are merging from the left index to right index 
        while(i < n1 && j < n2){
            if(l[i] <= r[j]){
                arr[k] = l[i];
                i++;
            }else{
                arr[k] = r[j];
                j++;
            }
            k++;
        }
        while(i < n1){
            arr[k] = l[i];
            i++;
            k++;
        }
        while(j < n2){
            arr[k] = r[j];
            j++;
            k++;
        }
    }
}
