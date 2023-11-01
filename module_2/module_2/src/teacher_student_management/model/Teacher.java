package teacher_student_management.model;

public class Teacher extends Person{
    private String level;


    public Teacher(Integer code, String name, String dayOfBirth, String gender, String level) {
        super(code, name, dayOfBirth, gender);
        this.level = level;
    }
    public Teacher(String name, String dayOfBirth, String gender, String level){
        super(name,dayOfBirth,gender);
        this.level = level;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Giảng viên: " +
                super.toString()+
                ", level=" + level;
    }
}
