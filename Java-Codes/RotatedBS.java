public class RotatedBS {
    
    public static void main(String[] args) {
        int[] arr={4,5,6,0,1,2};
        System.out.println(bs(arr,5,0,arr.length-1));
    }

    static int bs(int arr[],int key,int start,int end){
        int pivot = findPivot(arr);
        //if pivot not found i.e the array is not rotated
        if(pivot == -1){
            //just do normal bs
            return SearchBin(arr, key ,start,end);
        }
        if(arr[pivot] == key){
            return pivot;
        }
        if(key >= arr[0]){
            return SearchBin(arr, key, start,pivot -1);
        }
        return SearchBin(arr, key, pivot+1, arr.length-1);
    }
    static int SearchBin(int arr[],int key, int start, int end){
    
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


    static int findPivot(int[] arr){
        int start=0;
        int end= arr.length-1;
        while (start <= end) {
            int mid = start + (end -start)/2;
            if(mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }
            if(arr[mid] < arr[mid-1]){
                return mid-1;
            }
            if(arr[mid] <= arr[start]){
                end = mid-1;
            }
            else{
                start = mid +1;
            }
            
            
        }
        return -1;
    }
}
