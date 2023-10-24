package ss10_DSA_Stack_Queue.bai_tap.count_char;

import java.util.TreeMap;

public class NumberOfChar2 {
    public static void main(String[] args) {
        String str = "Mistakes are always forgivable if one has the courage to admit them";
        str = str.toLowerCase();
        TreeMap<Character, Integer> treeMapChar = new TreeMap<>();
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            treeMapChar.put(str.charAt(i), count);
        }
        System.out.println(treeMapChar);
    }

}
