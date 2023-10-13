package ss05_AccessModifier_Static.bai_tap.student;

public class Student {
    private String name = "John";
    private String classes = "C02";

    Student() {
    }

    public void setName(String name) {
        this.name = name;
    }

    protected void setClasses(String classes) {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", classes='" + classes + '\'' +
                '}';
    }
}
