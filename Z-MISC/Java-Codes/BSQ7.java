public class BSQ7 {
    public static void main(String[] args) {
        int[] arr={1,2,3,5,8,13,7,6,4,3,1};
        int target = 3;
        System.out.println(search(arr, target));
    }
    static int search(int[] arr, int target){
        int peak=peakIndexMArr(arr);
        int firstTry = orderAgno(arr, target, 0, peak);
        if(firstTry != -1){
            return firstTry;
        }
        return orderAgno(arr, target, peak + 1, arr.length-1);

    }
    static int peakIndexMArr(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start < end){
            int mid = start + (end - start)/2;
            if(arr[mid] > arr[mid+1]){
                end = mid;
            }
            else{
                start = mid+1;
            }
        }
        return start;
    }
        static int orderAgno(int[] arr, int target, int start, int end){
            boolean isAsc = arr[start] < arr[end];
            while( start <= end){
                int mid = start + (end-start)/2;
                if(arr[mid] == target){
                    return mid;
                }
                if (isAsc){
                    if(target > arr[mid]){
                        start = mid+1;
                    }
                    else if(target < arr[mid]){
                        end = mid -1;
                    }
                }
                else{
                    if(target > arr[mid]){
                        end = mid - 1;
                    }
                    else{
                        start = mid + 1;
                    }
                }
            }
            return -1;
        }
        
}
