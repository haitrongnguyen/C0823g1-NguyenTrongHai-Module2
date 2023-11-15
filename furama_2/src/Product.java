import furama_resort.models.facility.Facility;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapExam {
    MapExam mapExam = new MapExam();
    MapExam[]mapExams = new MapExam[10];
    public static Integer count = 0;
    public static void main(String[] args) {
        Map<String,Integer> map = new LinkedHashMap<>();
        map.put("A",count);
        map.put("B",1);
        map.put("C",1);
        map.put("D",1);

        Set<String> set = map.keySet();
        System.out.println(set);
//        for (Map.Entry<String,Integer> entry: map.entrySet()){
//            if (entry.getKey().equals("A")){
//                entry.setValue(entry.getValue()+1);
//                System.out.println(entry);
//            }
//        }
        for (String s: set){
            System.out.println();
        }


    }
}
