package test_array_list;

import java.util.*;

public class TestArrayList {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("a");
        arrayList.add("b");
        String[] arr = new String[arrayList.size()];
        arr = arrayList.toArray(arr);
        System.out.println(Arrays.toString(arr));
    }
}
