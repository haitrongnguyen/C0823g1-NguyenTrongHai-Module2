package teacher_student_management.model;

public class Student extends Person {
    private String className;
    private double score;

    public Student() {
    }

    public Student(String code, String name, String dayOfBirth, String gender, String className, double score) {
        super(code, name, dayOfBirth, gender);
        this.className = className;
        this.score = score;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                super.toString()+
                "className='" + className + '\'' +
                ", score=" + score +
                '}';
    }
}
