package teacher_student_management.model;

public abstract class Person {
    public String code;
    public String name;
    public String dayOfBirth;
    public String gender;

    public Person() {
    }

    public Person(String code, String name, String dayOfBirth, String gender) {
        this.code = code;
        this.name = name;
        this.dayOfBirth = dayOfBirth;
        this.gender = gender;
    }
    public void add(){

    }
}
