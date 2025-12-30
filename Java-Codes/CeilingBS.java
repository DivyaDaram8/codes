public class CeilingBS {
    public static void main(String[] args){
        int[] arr={2,3,5,9,14,16,18};
        int target=15;
        int result = ceilingBinarySearch(arr,target);
        System.out.println(result);
    }
    static int ceilingBinarySearch(int a[], int key){
        int start = 0;
        int end = a.length-1;
        if(key > a[end]){
            return -1;//for ceiling
        }
        //for example if key is 16, but the max ele in array is 15, in that case it returns -1;
        //for floor
        /*
         if(key < a[start]){
         return -1;
         }
         */
        
        while(start <= end){
            int mid = start + (end-start)/2;
           
            if(a[mid] == key){
                return mid;
            }
            if(a[mid] > key){
                end = mid - 1;
            }
            if(a[mid] < key){
                start = mid + 1;
            }
        } 
        return a[start];//for ceiling of a num
        // return a[end] for floor of a num
    }
}

