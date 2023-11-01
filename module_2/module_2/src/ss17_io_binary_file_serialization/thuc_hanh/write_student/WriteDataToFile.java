package ss17_io_binary_file_serialization.thuc_hanh.write_student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteDataToFile {
    public static void writeData(String path, List<Student> studentList){
        FileOutputStream fileOutputStream =null;
        ObjectOutputStream objectOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(path);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(studentList);
            objectOutputStream.close();
            fileOutputStream.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
