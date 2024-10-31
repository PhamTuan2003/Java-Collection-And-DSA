package Collection.Search;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int target = 8;
        int a = binarySearch(arr, target);
        System.out.println(a);
    }

    public static int binarySearch(int[]arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] > target) {
                right = mid - 1;
            }
            else if (arr[mid] < target) {
                left = mid + 1;
            }
        }
        return -1;
    }
}
