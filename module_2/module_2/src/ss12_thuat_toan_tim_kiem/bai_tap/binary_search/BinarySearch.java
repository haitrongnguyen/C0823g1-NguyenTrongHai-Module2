package ss12_thuat_toan_tim_kiem.bai_tap.binary_search;


import java.util.Arrays;

public class BinarySearch {
//    private static int binarySearch(int low, int high, int[] arr, int number) {
//        int mid;
//        if (low <= high) {
//            mid = low + (high - low) / 2;
//            if (arr[mid] == number) {
//                return mid;
//            } else if (arr[mid] > number) {
//                return binarySearch(low, mid - 1, arr, number);
//            } else {
//                return binarySearch(mid + 1, high, arr, number);
//            }
//        }
//        return -1;
//    }

    private static boolean binarySearch(int low, int high, int[] arr, int number) {
        int mid;
        boolean flag = false;
        if (low <= high) {
            mid = (high + low) / 2;
            if (arr[mid] == number) {
                flag = true;
            } else if (arr[mid] > number) {
                return binarySearch(low, mid - 1, arr, number);
            } else {
                return binarySearch(mid + 1, high, arr, number);
            }
        }
        return flag;
    }

    private static void sort(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {9, 7, 3, 8, 1, 5, 6, 4, 7, 15, 45, 87};
        sort(arr);
        System.out.println(Arrays.toString(arr));
//        int binary = binarySearch(0, arr.length - 1, arr, 50);
//        if (binary == -1){
//            System.out.println("Không tìm thấy");
//        }else {
//            System.out.println("Có phần tử trong chuỗi");
//        }
        System.out.println(binarySearch(0, arr.length - 1, arr, 100));
    }
}
