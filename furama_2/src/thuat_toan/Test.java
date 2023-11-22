package thuat_toan;

import java.util.*;

public class Test {

    public static void main(String[] args) {
        System.out.println("Nhập độ dài mảng: ");
        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.println("Nhập phần tử thứ "+(i+1));
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println(Arrays.toString(array));
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < length; i++) {
            addElement(map,array[i]);
        }
        int max = 0;
        int temp = 0;
        for (Integer i: map.keySet()){
            System.out.println(i+" xuất hiện "+map.get(i)+" lần.");
            if (map.get(i)>max){
                max = map.get(i);
                temp = i;
            }
        }
        System.out.println("Số "+ temp +" lần xuất hiện nhiều nhất "+max);
    }

    private static void addElement(Map<Integer, Integer> map, int i) {
        if (map.containsKey(i)){
//            int count = map.get(i)+1;
            int count = map.get(i)+1;
            map.put(i,count);
        }else {
            map.put(i,1);
        }
    }
}
