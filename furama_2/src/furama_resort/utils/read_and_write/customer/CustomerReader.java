package furama_resort.utils.read_and_write.customer;

import furama_resort.models.person.Customer;
import furama_resort.models.person.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CustomerReader {
    public static List<Customer> readCustomer(String path){
//        File file = new File(path);
//        FileReader fileReader = null;
//        BufferedReader bufferedReader = null;
//        List<Customer> customerList = new ArrayList<>();
//        Customer customer;
//        try {
//
//            fileReader = new FileReader(file);
//            bufferedReader = new BufferedReader(fileReader);
//            String line;
//            String[] lineString;
//            while ((line = bufferedReader.readLine())!=null){
//                lineString = line.split(",");
//                 customer = new Customer(lineString[0],lineString[1],lineString[2],lineString[3],
//                        lineString[4],lineString[5],lineString[6],
//                        lineString[7],lineString[8]);
//                customerList.add(customer);
//            }
//        }catch (ArrayIndexOutOfBoundsException ignored){
//
//        } catch (FileNotFoundException e) {
//            System.err.println("Không tìm thấy file");;
//        } catch (IOException e) {
//            System.err.println(e.getMessage());
//        }finally {
//            try {
//                assert bufferedReader != null;
//                bufferedReader.close();
//            } catch (IOException e) {
//                System.err.println(e.getMessage());;
//            }
//        }
//        return customerList;
        File file = new File(path);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        List<Customer> customerList = new ArrayList<>();
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            Customer customer;
            String line;
            String[] lineString;
            while ((line = bufferedReader.readLine())!=null){
                lineString = line.split(",");
                customer = new Customer(lineString[0],lineString[1],lineString[2],lineString[3],
                        lineString[4],lineString[5],lineString[6],lineString[7],lineString[8]);
                customerList.add(customer);
            }

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());;
        }finally {
            try {
                assert bufferedReader != null;
                bufferedReader.close();
                fileReader.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
        return customerList;
    }
}
