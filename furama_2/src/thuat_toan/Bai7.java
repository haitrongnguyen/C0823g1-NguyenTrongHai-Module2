package thuat_toan;

import java.util.ArrayList;
import java.util.List;

public class Bai7 {
    public static void main(String[] args) {
        int[]arr = {11,12,21,13,31,89,56,19};
        List<Integer> integers = new ArrayList<>();
        int s;
        int t;
        for (int i = 0; i < arr.length; i++) {
            s = arr[i]/10;
            t = arr[i]%10;
            if (t>s){
                integers.add(arr[i]);
            }
        }
        for (Integer i: integers){
            System.out.print(i+" ");
        };
    }
}
