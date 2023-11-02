package furama_resort.repositories.impl;

import furama_resort.models.person.Customer;
import furama_resort.repositories.ICustomerRepository;
import furama_resort.utils.read_and_write.customer.CustomerReader;
import furama_resort.utils.read_and_write.customer.CustomerWriter;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements ICustomerRepository {
    private static final String CUSTOMER_LIST = "src/furama_resort/data/customer.csv";
    private static List<Customer> customerList;
    @Override
    public List<Customer> getAll() {
        return CustomerReader.readCustomer(CUSTOMER_LIST);
    }

    @Override
    public boolean findCodeCustomer(String code) {
        customerList = CustomerReader.readCustomer(CUSTOMER_LIST);
        for (Customer customer:customerList){
            if (customer.getCode().equals(code)){
                return true;
            }
        }
        return false;
    }

    @Override
    public void addCustomer(Customer customer) {
        customerList = CustomerReader.readCustomer(CUSTOMER_LIST);
        customerList.add(customer);
        CustomerWriter.writeCustomer(CUSTOMER_LIST,customerList);
    }

    @Override
    public void editCustomer(Customer customer) {
        customerList = CustomerReader.readCustomer(CUSTOMER_LIST);
        for (Customer customer1: customerList){
            //    KH-0001,Thanh Dụng,15/06/1993,Nam,123456789,0123456789,abc@gmail.com,Gold,Quảng Ngãi
            if (customer1.getCode().equals(customer.getCode())){
                customer1.setName(customer.getName());
                customer1.setDateOfBirth(customer.getDateOfBirth());
                customer1.setGender(customer.getGender());
                customer1.setIdCard(customer.getIdCard());
                customer1.setPhoneNumber(customer.getPhoneNumber());
                customer1.setEmail(customer.getEmail());
                customer1.setStyleCustomer(customer.getStyleCustomer());
                customer1.setAddress(customer.getAddress());
            }
        }
        CustomerWriter.writeCustomer(CUSTOMER_LIST,customerList);
    }

    @Override
    public void removeCustomer(String code) {
        customerList = CustomerReader.readCustomer(CUSTOMER_LIST);
        for (Customer customer: customerList){
            if (customer.getCode().equals(code)){
                customerList.remove(customer);
                break;
            }
        }
        CustomerWriter.writeCustomer(CUSTOMER_LIST,customerList);
    }

    @Override
    public List<Customer> searchByNameCustomer(String name) {
        customerList = CustomerReader.readCustomer(CUSTOMER_LIST);
        List<Customer> returnCustomerList = new ArrayList<>();
        for (Customer customer: customerList){

            if (customer.getName().toLowerCase().contains(name)){
                returnCustomerList.add(customer);
            }
        }
        return returnCustomerList;
    }

}
