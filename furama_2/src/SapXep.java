import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SapXep {
    public static void main(String[] args) {
        int[]a = {1,1,2,2,2,2,3,3,4};
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            addElement(map,a[i]);
        }
        for (Integer i:map.keySet()){
            System.out.println(i+" xuất hiện "+map.get(i)+" lần");
        }
    }

    private static void addElement(Map<Integer, Integer> map, int i) {
        if (map.containsKey(i)){
            map.put(i,map.get(i) + 1);
        }else {
            map.put(i,1);
        }
    }
}
