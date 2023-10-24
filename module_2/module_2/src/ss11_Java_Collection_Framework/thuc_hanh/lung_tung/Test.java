package ss11_Java_Collection_Framework.thuc_hanh.lung_tung;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Student student1 = new Student("A",18,"abc");
        Student student2= new Student("B",18,"abc");
        Student student3 = new Student("C",18,"abc");
        Student student4 = new Student("D",18,"abc");
        Student student5 = new Student("E",18,"abc");
        Student student6 = new Student("F",18,"abc");
        ArrayList<Student> studentArrayList = new ArrayList<>();
        Map<Integer, Student> studentMap = new HashMap<>();
        Set<Student> studentSet = new HashSet<Student>();
        studentSet.add(student1);
        studentSet.add(student2);
        studentSet.add(student3);
        studentMap.put(1,student1);
        studentMap.put(2,student2);
        studentMap.put(3,student3);
        for (Map.Entry<Integer,Student> studentMap1:studentMap.entrySet()){
            System.out.println(studentMap1.toString());
        }
        System.out.println("------------------");
        for (Student studentSet1: studentSet){
            System.out.println(studentSet1.toString());
        }
    }
}
