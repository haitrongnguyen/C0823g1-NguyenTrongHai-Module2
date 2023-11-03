package furama_resort.utils.read_and_write.employee;

import furama_resort.models.person.Employee;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class EmployeeWriter {
    public static void write(String path, List<Employee> list) {
        FileWriter fileWriter;
        BufferedWriter bufferedWriter = null;
        try {
            File file = new File(path);
            fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Employee employee: list){
                bufferedWriter.write(employee.getCode()+","+ employee.getName()+","+employee.getDateOfBirth()+","+
                        employee.getGender()+","+employee.getIdCard()+","+ employee.getPhoneNumber()+","+
                        employee.getEmail()+","+employee.getLevel()+","+employee.getLocation()+","+
                        employee.getWage());
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
        } catch (IOException i) {
            i.printStackTrace();
        }finally {
            try {
                assert bufferedWriter != null;
                bufferedWriter.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
