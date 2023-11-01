package test_io_file.untils;

import test_io_file.models.Student;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;


public class StudentWrite {
    public static void writeStudent(String path, Student student){
        File file = new File(path);
        BufferedWriter bufferedWriter = null;
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(file,true);
            bufferedWriter = new BufferedWriter(fileWriter);
            String line = null;

                bufferedWriter.write(student.getId() + "," + student.getName() + ","+student.getDateOfBirth()+","+student.getClassName());
                bufferedWriter.newLine();
                bufferedWriter.flush();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                bufferedWriter.close();
                fileWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public static void writeStudents(String path,List<Student> students){
        File file = new File(path);
        BufferedWriter bufferedWriter = null;
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            String line = null;
            for (Student student:students){
                bufferedWriter.write(student.getId() + "," + student.getName() + ","+student.getDateOfBirth()+","+student.getClassName());
                bufferedWriter.newLine();
                bufferedWriter.flush();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                bufferedWriter.close();
                fileWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
