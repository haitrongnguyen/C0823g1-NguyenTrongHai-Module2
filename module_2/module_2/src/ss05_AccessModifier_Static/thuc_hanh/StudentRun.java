package ss05_AccessModifier_Static.thuc_hanh;

public class StudentRun {
    public static void main(String[] args) {
        Student student1 = new Student(1,"A");
        Student student2 = new Student(2,"B");
        student1.display();
        student2.display();
        Student.change();
        student1.display();
        student2.display();
    }
}
