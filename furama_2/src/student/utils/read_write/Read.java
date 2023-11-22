package student.utils.read_write;

import student.models.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Read {
    public static List<Student> readStudent(){
        File file = new File("src/student/data/student.csv");
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        List<Student> students = new ArrayList<>();
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            String[] lineString;
            while ((line = bufferedReader.readLine())!= null){
                lineString = line.split(",");
                students.add(new Student(lineString[0],lineString[1],Integer.parseInt(lineString[2]),
                        lineString[3]));
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }finally {
            try {
                assert bufferedReader != null;
                fileReader.close();
                bufferedReader.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
        return students;

    }
}
