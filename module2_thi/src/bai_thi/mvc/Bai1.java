package bai_thi.mvc;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số phần tử");
        int length = Integer.parseInt(scanner.nextLine());
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.println("Nhập phần tử thứ " + (i + 1));
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Mảng vừa tạo");
        System.out.println(Arrays.toString(array));
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            addElement(map, array[i]);
        }
        if (numberOnce(map) == -1) {
            System.out.println("Không có số độc thân");
        } else {
            System.out.println(numberOnce(map) + " là số độc thân");
        }

    }


    public static void addElement(Map<Integer, Integer> map, int i) {
        if (map.containsKey(i)) {
            map.put(i, map.get(i) + 1);
        } else {
            map.put(i, 1);
        }

    }

    public static int numberOnce(Map<Integer, Integer> map) {
        int number = 0;
        for (Integer i : map.keySet()) {
            if (map.get(i) == 1) {
                number = i;
            } else {
                number = -1;
            }
        }
        return number;
    }
}
