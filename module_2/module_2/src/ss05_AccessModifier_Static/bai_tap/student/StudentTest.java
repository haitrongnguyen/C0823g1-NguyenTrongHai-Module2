package ss05_AccessModifier_Static.bai_tap.student;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        student1.setName("Bill");
        student1.setClasses("C03");
        System.out.println(student1);
        System.out.println(student2);
    }
}
