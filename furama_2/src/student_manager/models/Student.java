package student_manager.models;

public class Student extends Person{
    private String className;
    private double score;

    public Student() {
    }

    public Student(String code, String name, String dateOfBirth, String gender, String className, double score) {
        super(code, name, dateOfBirth, gender);
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
        return "Học sinh " + super.toString()+
                ", className='" + className +
                ", score=" + score
                ;
    }
}
