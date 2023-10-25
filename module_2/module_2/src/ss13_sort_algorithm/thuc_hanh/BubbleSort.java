package ss13_sort_algorithm.thuc_hanh;

import java.util.Arrays;

public class BubbleSort {
    private static void bubbleSort(int[]arr){
        boolean needNextPass = true;
        int temp;
        for (int i = 0; i < arr.length; i++) {
            needNextPass = false;
            for (int j = arr.length-1; j > i; j--) {
                if (arr[j]<arr[j-1]){
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                    needNextPass = true;
                }
            }
            System.out.println(needNextPass);
            if (!needNextPass){
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[]array = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }
}
