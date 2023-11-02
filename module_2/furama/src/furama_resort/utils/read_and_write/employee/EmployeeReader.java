package furama_resort.utils.read_and_write.employee;


import furama_resort.models.person.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeReader {
    public static List<Employee> read(String path){
        File file = new File(path);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        List<Employee> employeeList = new ArrayList<>();
        Employee employee;
        try {

            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            String[] lineString;
            while ((line = bufferedReader.readLine())!=null){
                lineString = line.split(",");
                employee = new Employee(lineString[0],lineString[1],lineString[2],lineString[3],
                        lineString[4],lineString[5],lineString[6],
                        lineString[7],lineString[8],Long.parseLong(lineString[9]));
                employeeList.add(employee);
            }
        }catch (ArrayIndexOutOfBoundsException ignored){

        } catch (FileNotFoundException e) {
            System.err.println("Không tìm thấy file");;
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }finally {
            try {
                assert bufferedReader != null;
                bufferedReader.close();
            } catch (IOException e) {
                System.err.println(e.getMessage());;
            }
        }
        return employeeList;
    }
}
