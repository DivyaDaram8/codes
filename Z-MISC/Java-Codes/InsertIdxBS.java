public class InsertIdxBS {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 10};
        int target = 99; // Example target value
        int begin = 0;
        int end = arr.length - 1;
        while (begin <= end) {
            int mid = end + (begin - end) / 2;
            if (arr[mid] < target) {
                begin = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            }
        }
        System.out.println(begin);
    }
}