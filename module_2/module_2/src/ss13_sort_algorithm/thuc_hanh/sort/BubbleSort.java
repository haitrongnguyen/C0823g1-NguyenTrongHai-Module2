package ss13_sort_algorithm.thuc_hanh.sort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[]arr = {1,2,3,4,5,11,7,8,9,10};
        int length = arr.length;
        int temp;
        boolean sortNext = true;
        for (int i = 0; i < length && sortNext; i++) {
            sortNext = false;
            for (int j = length-1; j > i ; j--) {
                if (arr[j]<arr[j-1]){
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                    sortNext = true;
                    System.out.println(Arrays.toString(arr));
                    System.out.println(sortNext);
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(sortNext);
    }
}
