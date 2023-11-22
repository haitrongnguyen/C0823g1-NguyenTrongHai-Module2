package thuat_toan;

import java.util.Set;
import java.util.TreeSet;

public class Number {
    public static void main(String[] args) {
        int[]a = {1,12,8,7,5,6,8,9,9};
        int max1 = a[0];
        int max2 = a[0];
        for (Integer i: a) {
            if (i>max1){
                max2 = max1;
                max1 = i;
            }else if (i>max2 && i<max1){
                max2 = i;
            }
        }
        System.out.println(max2);
    }
}
