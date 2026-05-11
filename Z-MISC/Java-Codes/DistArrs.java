import java.util.*;

public class DistArrs {
    public static void main(String[] args) {
        int[] arr1 = {2, 1, 100, 3};
        int[] arr2 = {5, 6, 10, 8, 7};
        int d = 6;
        System.out.println("Distance Value: " + findTheDistanceValue(arr1, arr2, d));
    }

    public static int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr1);
        int begin = 0;
        int end = arr1.length - 1;
        while (begin <= end) {
            int mid = begin + (end - begin) / 2;
            if (isTrue(arr2, arr1[mid], d)) {
                begin = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return begin;
    }

    public static boolean isTrue(int[] arr2, int val, int d) {
        for (int num : arr2) {
            if (Math.abs(num - val) <= d) {
                return false;
            }
        }
        return true;
    }
}

