package furama_resort.utils.read_and_write.customer;

import furama_resort.models.person.Customer;
import furama_resort.models.person.Employee;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class CustomerWriter {
    private static final String COMA = ",";
    public static void writeCustomer(String path, List<Customer> list) {
//        FileWriter fileWriter;
//        BufferedWriter bufferedWriter = null;
//        try {
//            File file = new File(path);
//            fileWriter = new FileWriter(file);
//            bufferedWriter = new BufferedWriter(fileWriter);
//            for (Customer customer: list){
//                bufferedWriter.write(customer.getCode()+","+ customer.getName()+","+customer.getDateOfBirth()+","+
//                        customer.getGender()+","+customer.getIdCard()+","+ customer.getPhoneNumber()+","+
//                        customer.getEmail()+","+customer.getStyleCustomer()+","+customer.getAddress());
//                bufferedWriter.newLine();
//            }
//            bufferedWriter.flush();
//        } catch (IOException i) {
//            i.printStackTrace();
//        }finally {
//            try {
//                assert bufferedWriter != null;
//                bufferedWriter.close();
//            } catch (IOException ex) {
//                ex.printStackTrace();
//            }
//        }
        File file = new File(path);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Customer customer: list){
                bufferedWriter.write(customer.getCode()+COMA+customer.getName()+COMA+
                        customer.getDateOfBirth()+COMA+customer.getGender()+COMA+customer.getIdCard()+
                        COMA+customer.getPhoneNumber()+COMA+customer.getEmail()+COMA+
                        customer.getStyleCustomer()+COMA+customer.getAddress());
                bufferedWriter.newLine();
                bufferedWriter.flush();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }finally {
            try {
                assert bufferedWriter != null;
                bufferedWriter.close();
                fileWriter.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());;
            }

        }
    }
}
