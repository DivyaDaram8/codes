import java.util.Scanner;
public class binarySearch {
    static int SearchBin(int arr[],int key){
        int start = 0;
        int end= arr.length-1;
        while(start <= end){
        int mid = start+ (end - start)/2;
        if(key < arr[mid]){
            end = mid -1;
        }
        else if(key > arr[mid]){
            start = mid +1;
        }
        else{
            return mid;
        }
     }
     return -1;

    }
     
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int[] arr={1,2,3,4,5,6,7,8,9};//here the order is in order;
        int target=4;
        int res= SearchBin(arr,target);
        System.out.println(res);
        s.close();
    }
}
