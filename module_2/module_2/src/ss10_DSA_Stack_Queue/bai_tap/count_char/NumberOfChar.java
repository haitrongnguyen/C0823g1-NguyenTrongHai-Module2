package ss10_DSA_Stack_Queue.bai_tap.count_char;

import java.util.TreeMap;

public class NumberOfChar {
    public static void main(String[] args) {
        String string = "Mistakes are always forgivable if one has the courage to admit them";
        string = string.toLowerCase();
        int count;
        TreeMap<Character, Integer> stringIntegerTreeMap = new TreeMap<>();
        for (int i = 0; i < string.length(); i++) {
            count = 0;
            for (int j = 0; j < string.length(); j++) {
                if (string.charAt(i) == string.charAt(j)) {
                    count++;
                }
            }
            stringIntegerTreeMap.put(string.charAt(i), count);
        }
        System.out.println(stringIntegerTreeMap);
    }
}
