package test_io_file.models;

public class Student {
    private int id;
    private String name;
    private String dateOfBirth;
    private String className;

    public Student() {
    }

    public Student(int id, String name, String dateOfBirth, String className) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.className = className;
    }

    public Student(String name, String dateOfBirth, String className) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.className = className;
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

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public String toString() {
        return "Student : " +
                "id= " + id +
                ", name= " + name +
                ", dateOfBirth= " + dateOfBirth +
                ", className= " + className +
                '}';
    }
}
