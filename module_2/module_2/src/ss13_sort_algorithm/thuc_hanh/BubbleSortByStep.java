package ss13_sort_algorithm.thuc_hanh;

import java.util.Arrays;

public class BubbleSortByStep {
    public static void main(String[] args) {
        int[]arr = {1,3,7,6,2,9,15,42,85,12,21};
        int temp;
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i; j++) {
                if (arr[j]>arr[j+1]){
                    temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
