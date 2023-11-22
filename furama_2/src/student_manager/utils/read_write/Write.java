package student_manager.utils.read_write;

import student_manager.models.Student;
import student_manager.models.Teacher;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Write<E> {
    public static <E> void write(String path, List<E> strings){
        File file = new File(path);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
             fileWriter = new FileWriter(file);
             bufferedWriter = new BufferedWriter(fileWriter);
             for (E e:strings){
                 if (e instanceof Student){
                     bufferedWriter.write(((Student) e).getCode()+","+((Student) e).getName()+","+
                             ((Student) e).getDateOfBirth()+((Student) e).getGender()+","+
                             ((Student) e).getClassName()+","+((Student) e).getScore());
                 }else if (e instanceof Teacher){
                     bufferedWriter.write(((Teacher) e).getCode()+","+((Teacher) e).getName()+","+
                             ((Teacher) e).getDateOfBirth()+","+((Teacher) e).getGender()+","+
                             ((Teacher) e).getLevel());
                 }
                 bufferedWriter.newLine();
             }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }finally {
            try {
                assert bufferedWriter != null;
                bufferedWriter.close();
                fileWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
