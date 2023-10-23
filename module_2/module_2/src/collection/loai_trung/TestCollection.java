package collection.loai_trung;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class TestCollection {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("JS");
        list.add("PHP");
        list.add("Java");
        list.add("JS");
        list.add("PHP");
        List<String> list1 = list.stream().distinct().collect(Collectors.toList());
        System.out.println(list1);
        Set<String> stringSet = new LinkedHashSet<>();
        list.removeIf(s -> !stringSet.add(s));
        System.out.println(stringSet);
    }
}
