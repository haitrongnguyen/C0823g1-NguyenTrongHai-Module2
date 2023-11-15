package furama_resort.services.impl;

import furama_resort.models.person.Customer;
import furama_resort.repositories.ICustomerRepository;
import furama_resort.repositories.impl.CustomerRepository;
import furama_resort.services.ICustomerService;

import java.util.List;

public class CustomerService implements ICustomerService {
    private static ICustomerRepository customerRepository = new CustomerRepository();
    @Override
    public List<Customer> getAll() {
        return customerRepository.getAll();
    }

    @Override
    public boolean findCodeCustomer(String code) {
        return customerRepository.findCodeCustomer(code);
    }

    @Override
    public void addCustomer(Customer customer) {
        customerRepository.addCustomer(customer);
    }

    @Override
    public void editCustomer(Customer customer) {
        customerRepository.editCustomer(customer);
    }

    @Override
    public void removeCustomer(String code) {
        customerRepository.removeCustomer(code);
    }

    @Override
    public List<Customer> searchByNameCustomer(String name) {
        return customerRepository.searchByNameCustomer(name);
    }
}
