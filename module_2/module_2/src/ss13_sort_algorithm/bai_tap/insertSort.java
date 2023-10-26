package ss13_sort_algorithm.bai_tap;

import java.util.Arrays;

public class insertSort {
    public static void main(String[] args) {
        int[]arr = {5,1,2,7,9,6,4,3,10};
        int pos, x;
        for(int i = 1; i < arr.length; i++){
            x = arr[i];
            pos = i;
            while(pos > 0 && x < arr[pos-1]){
                arr[pos] = arr[pos-1];
                pos--;
            }
            arr[pos] = x;
            System.out.println(Arrays.toString(arr));
        }
    }
}
