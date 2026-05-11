public class LessThanTarget{
    public static void main(String[] args){
        char arr[] = {'c', 'e', 'g', 'k', 'y'};
        char target = 'b';
        int begin = 0;
        int end = arr.length - 1;
        char ans = 'a';
        while(begin <= end){
            int mid = end + (begin - end) /  2;
            if(arr[mid] > target){
                end = mid -1;
            }
            else if(arr[mid] < target){
                begin = mid + 1;
            }
            else {
                System.out.println(arr[end]);
                return;
            }
        }
        if(end < 0){
            ans = 'a';
        }else{
            ans = arr[end];
        }
        System.out.println(ans);
    }
}
// public static void main(String[] args){
//     char arr[] = {'c', 'e', 'g', 'k', 'y'};
//     char target = 'f';
//     int begin = 0;
//     int end = 0;
//     char ans = 'a';
//     while(begin <= end){
//         int mid = end + (begin - end) /  2;
//         if(arr[mid] > target){
//             end = mid -1;
//         }
//         else if(arr[mid] < target){
//             begin = mid + 1;
//         }
//         else {
//             return arr[end];
//         }
//     }
//     return arr[mid];
// }