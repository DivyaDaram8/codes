import java.util.Scanner;

public class BubSort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter length of the array: ");
        int n = s.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements into the array");
        for(int i = 0; i < n; i++){
            arr[i] = s.nextInt();
        }
        BubbleSort(n,arr);
        System.out.println("After sorting");
        for(int i = 0; i < n;i++){
            System.out.print(arr[i]+" ");
        }

        s.close();
    }
    public static void BubbleSort(int n, int[] arr){
        int temp;
        for(int i = 0; i < n -1; i++){
            boolean swapped = false;
            for(int j = 0; j < n - i - 1; j++){
                if(arr[j] > arr[j+1]){
                    temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    swapped = true;
                }
            }
            if(swapped == false){
                break;
            }
        } 
    }
}
