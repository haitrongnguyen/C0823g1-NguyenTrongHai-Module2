package student.utils.read_write;

import student.models.Student;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteStudent {
    public static void write(List<Student> students){
        File file = new File("src/student/data/student.csv");
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
             fileWriter= new FileWriter(file);
             bufferedWriter = new BufferedWriter(fileWriter);
             for (Student student: students){
                 bufferedWriter.write(student.getId()+","+
                         student.getName()+","+
                         student.getAge()+","+
                         student.getClassName());
                 bufferedWriter.newLine();
             }
             bufferedWriter.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }finally {
            try {
                assert bufferedWriter != null;
                fileWriter.close();
                bufferedWriter.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
