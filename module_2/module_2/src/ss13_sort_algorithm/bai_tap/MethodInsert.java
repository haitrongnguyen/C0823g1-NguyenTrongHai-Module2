package ss13_sort_algorithm.bai_tap;

import java.util.Arrays;

public class MethodInsert {
    private static void insertionSort(int[] list) {
        int x;
        int pos;
        for (int i = 1; i < list.length; i++) {
            x = list[i];
            pos = i;
            while (pos > 0 && x < list[pos - 1]) {
                list[pos] = list[pos - 1];
                pos--;
            }
            list[pos] = x;
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 1, 2, 7, 9, 6, 4, 3, 10};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
