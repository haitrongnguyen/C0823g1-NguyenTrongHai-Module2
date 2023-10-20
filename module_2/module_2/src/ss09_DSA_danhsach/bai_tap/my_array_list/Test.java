package ss09_DSA_danhsach.bai_tap.my_array_list;

import java.util.Arrays;

public class Test {
    public static class Student {
        private int id;
        private String name;

        public Student() {
        }

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Student student1 = new Student(1, "A");
        Student student2 = new Student(2, "B");
        Student student3 = new Student(3, "C");
        Student student4 = new Student(4, "D");
        Student student5 = new Student(5, "E");
        MyList<Student> studentMyList = new MyList<>();
        Student student6 = new Student(6, "F");
        Student student7 = new Student(7, "G");
        studentMyList.add(student1);
        studentMyList.add(student2);
        studentMyList.add(student3);
        studentMyList.add(student4);
        studentMyList.add(student5);
//        studentMyList.clear();
//        studentMyList.add(3, student6);
//        System.out.println(studentMyList.size());
//        System.out.println(studentMyList.get(3).getName());
//        System.out.println(studentMyList.indexOf(student7));
//
//        for (int i = 0; i < studentMyList.size(); i++) {
//            System.out.println(studentMyList.get(i).getId() + " " + studentMyList.get(i).getName());
//        }
//        System.out.println("--------------------------------------------");
//        studentMyList.remove(5);
//        for (int i = 0; i < studentMyList.size(); i++) {
//            System.out.println(studentMyList.get(i).getId() + " " + studentMyList.get(i).getName());
//        }
        System.out.println(studentMyList.contains(student6));
        for (int i = 0; i < studentMyList.size(); i++) {
            System.out.println(studentMyList.get(i).getId() + " "+studentMyList.get(i).getName());
        }
//        for (int i = 0; i < studentMyList.size();i++){
//            Student student = (Student) studentMyList.elements[i];
//            System.out.println(student.getId() +" "+ student.getName());
//
//           System.out.println(Arrays.deepToString(studentMyList[i]));
//        }

    }
}
