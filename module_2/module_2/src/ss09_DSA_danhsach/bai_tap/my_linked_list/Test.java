package ss09_DSA_danhsach.bai_tap.my_linked_list;

public class Test {
    public static void main(String[] args) {
        class Student {
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
        MyLinkedList<Student> studentMyLinkedList = new MyLinkedList<>();
        Student student1 = new Student(1, "Anh");
        Student student2 = new Student(2, "Bình");
        Student student3 = new Student(3, "Chuối");
        Student student4 = new Student(4, "Dương");

        studentMyLinkedList.addFirst(student1);
        studentMyLinkedList.addLast(student2);
        studentMyLinkedList.add(1, student3);
//        System.out.println(studentMyLinkedList.);
        for (int i = 0; i < studentMyLinkedList.size(); i++) {
            Student student = studentMyLinkedList.get(i);
            System.out.println(student.getName());
        }
        MyLinkedList<Student> cloneList = studentMyLinkedList.clone();
        for (int i = 0; i < cloneList.size(); i++) {
            Student student = cloneList.get(i);
            System.out.println(student.getName());
        }
        System.out.println(studentMyLinkedList.contains(student4));

    }


}
