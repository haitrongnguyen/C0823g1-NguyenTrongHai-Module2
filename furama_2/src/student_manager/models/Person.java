package student_manager.models;

public class Person {
    private String code;
    private String name;
    private String dateOfBirth;
    private String gender;

    public Person() {
    }

    public Person(String code, String name, String dateOfBirth, String gender) {
        this.code = code;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Mã số: '" + code +
                ", Họ tên" + name +
                ", Ngày sinh" + dateOfBirth +
                ", Giới tính" + gender
                ;
    }
}
