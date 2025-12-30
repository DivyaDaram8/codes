package Algorithms;

import java.util.Scanner;

public class BinSearch {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = s.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements in sorted order: ");
        for(int i = 0; i < n; i++){
            arr[i] = s.nextInt();
        }
        System.out.println("Enter the number to be searched");
        int ele = s.nextInt();
        int idx = bsearch(arr, ele);
        if(idx == -1){
            System.out.println("Element not found");
        }else{
            System.out.println("Element is in the index: " + idx);
        }
        s.close();
    }
    public static int bsearch(int[] arr, int num){
        int left = 0;
        int right = arr.length - 1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(arr[mid] == num){
                return mid;
            }else if(arr[mid] > num){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return -1; 
    }
}
