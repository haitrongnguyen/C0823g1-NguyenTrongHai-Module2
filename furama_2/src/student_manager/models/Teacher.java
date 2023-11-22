package student_manager.models;

public class Teacher extends Person{
    private String level;

    public Teacher() {
    }

    public Teacher(String code, String name, String dateOfBirth, String gender, String level) {
        super(code, name, dateOfBirth, gender);
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
        return "Giảng viên " + super.toString()+
                ", Chuyên môn: " + level ;
    }
}
