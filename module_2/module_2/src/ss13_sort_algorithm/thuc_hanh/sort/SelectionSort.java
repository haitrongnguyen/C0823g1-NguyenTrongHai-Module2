package ss13_sort_algorithm.thuc_hanh.sort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[]arr = {5,1,2,7,9,6,4,3,10};
        int length = arr.length;
        int min;
        int temp;
        for (int i = 0; i < length-1; i++) {
            min = i;
            for (int j = i+1; j < length; j++) {
                if (arr[j]<arr[min]){
                    min = j;
                }
            }
            if (min != i){
                temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
            System.out.println(Arrays.toString(arr));
        }
        System.out.println(Arrays.toString(arr));
    }
}
