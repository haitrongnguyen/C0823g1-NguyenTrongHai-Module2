package ss12_thuat_toan_tim_kiem.thuc_hanh;

public class BinarySearch {
    static int[] arr = {1, 3, 5, 7, 9, 12, 16, 24, 25, 34, 38, 45, 47, 89};

    static int binarySearch(int[] arr, int number) {
        int low = 0;
        int high = arr.length - 1;
        while (arr[low] <= arr[high]) {
            int mid = (high + low) / 2;
            if (arr[mid] < number) {
                low = mid + 1;
            } else if (arr[mid] > number) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(binarySearch(arr, 12));
    }
}
