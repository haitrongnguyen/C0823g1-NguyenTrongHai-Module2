package ss13_sort_algorithm.thuc_hanh.sort;

import java.util.Arrays;

public class InsertSort {
    public static void main(String[] args) {
        int[]arr = {5,1,2,7,9,6,4,3,10};
        int pos;
        int x;
        int length = arr.length;
        for (int i = 1; i < length; i++) {
            x = arr[i];
            pos = i;
            while (pos>0 && x<arr[pos-1]){
                arr[pos] = arr[pos-1];
                pos--;

            }
            arr[pos] = x;
        }
        System.out.println(Arrays.toString(arr));
    }


}
