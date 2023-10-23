package teacher_student_management.repository;

public interface IPersonRepository {
    void addStudent(String code, String name, String dayOfBirth, String gender, String className, double score);
    void addTeacher(String code, String name, String dayOfBirth, String gender, String level);
    void removeStudent(String code);
    void removeTeacher(String code);
    void displayStudent();
    void displayTeacher();
}
