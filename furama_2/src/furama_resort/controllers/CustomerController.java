package furama_resort.controllers;

import furama_resort.models.person.Customer;
import furama_resort.services.ICustomerService;
import furama_resort.services.impl.CustomerService;

import java.util.List;

public class CustomerController {
    private ICustomerService customerService = new CustomerService();

    public List<Customer> getAll() {
        return customerService.getAll();
    }

    public boolean findCodeCustomer(String code) {
        return customerService.findCodeCustomer(code);
    }

    public void addCustomer(Customer customer) {
        customerService.addCustomer(customer);
    }

    public void editCustomer(Customer customer) {
        customerService.editCustomer(customer);
    }

    public void removeCustomer(String code) {
        customerService.removeCustomer(code);
    }

    public List<Customer> searchByNameCustomer(String name) {
        return customerService.searchByNameCustomer(name);
    }
}
