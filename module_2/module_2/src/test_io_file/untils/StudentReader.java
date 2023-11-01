package test_io_file.untils;

import test_io_file.models.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StudentReader {
    public static List<Student> reader(String path){
        List<Student> students = new ArrayList<>();
        Student student = new Student();
        File file = new File(path);
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            String[]lineString;
            while ((line = bufferedReader.readLine())!=null){
                lineString = line.split(",");
                Student student1 = new Student(Integer.parseInt(lineString[0]),lineString[1],lineString[2],lineString[3]);
                students.add(student1);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return students;
    }
}
