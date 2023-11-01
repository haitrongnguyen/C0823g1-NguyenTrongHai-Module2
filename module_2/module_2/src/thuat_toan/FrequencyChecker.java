package thuat_toan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FrequencyChecker {
    public static boolean checkEqualFrequency(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int count = 0;
        List<Integer> temp = new ArrayList<>();
        for (int i = 0; i < arr.length ; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] == arr[j]){
                    count++;
                }
            }
            if (count ==0 ){
                list.add(arr[i]);
            }
            count = 0;
        }
        for (int i = 0; i < list.size(); i++) {
            count=0;
            for (int j = 0; j < arr.length; j++) {
                if (list.get(i) == arr[j]){
                    count++;
                }
            }
            temp.add(count);
        }
        boolean check = true;;
        for (int i = 0; i < temp.size()-1; i++) {

            if (!temp.get(i).equals(temp.get(i+1)) ){
               check = false;
               break;
            }
        }
        return check;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,2,1,3,1};
        boolean result = checkEqualFrequency(arr);
        System.out.println("Tần số xuất hiện của tất cả các số nguyên có bằng nhau: " + result);
    }
}