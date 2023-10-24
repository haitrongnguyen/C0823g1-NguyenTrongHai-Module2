package ss11_Java_Collection_Framework.thuc_hanh.hash_map_hash_set;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student("a",15,"HN");
        Student student2 = new Student("b",15,"HN");
        Student student3 = new Student("c",15,"HN");
        Student student4 = new Student("d",15,"HN");
        Student student5 = new Student("e",15,"HN");
        Map<Integer,Student> hashMap = new HashMap<>();
        hashMap.put(1,student1);
        hashMap.put(2,student2);
        hashMap.put(3,student3);
        Set<Integer> set = hashMap.keySet();
        System.out.println(set);
        for (Integer i : set){
            System.out.println(i+ ": "+hashMap.get(i).getName()+" "+hashMap.get(i).getAge()+" "+hashMap.get(i).getAddress());
        }
        Set<Student> student = new HashSet<>();
        student.add(student1);
        student.add(student2);
        student.add(student3);
        for (Student students: student){
            System.out.println(students.toString());
        }
    }
}
