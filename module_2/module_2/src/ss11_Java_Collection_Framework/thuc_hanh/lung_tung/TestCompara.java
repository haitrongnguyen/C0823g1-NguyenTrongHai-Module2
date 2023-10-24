package ss11_Java_Collection_Framework.thuc_hanh.lung_tung;

import java.util.ArrayList;
import java.util.Collections;

public class TestCompara {
    public static void main(String[] args) {
        Student student1 = new Student("A",20,"abc");
        Student student2= new Student("B",19,"abc");
        Student student3 = new Student("C",18,"abc");
        Student student4 = new Student("D",18,"abc");
        Student student5 = new Student("E",18,"abc");
        Student student6 = new Student("F",18,"abc");
        ArrayList<Student> studentArrayList = new ArrayList<>();
        studentArrayList.add(student1);
        studentArrayList.add(student2);
        studentArrayList.add(student3);
        Collections.sort(studentArrayList);
        for (Student student: studentArrayList){
            System.out.println(student.toString());
        }
        System.out.println("----------------");
        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(studentArrayList,ageComparator);
        System.out.println("ss theo tuổi");
        for (Student student: studentArrayList){
            System.out.println(student.toString());
        }

    }
}
