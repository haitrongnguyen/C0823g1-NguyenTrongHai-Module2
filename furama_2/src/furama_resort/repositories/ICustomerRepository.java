package furama_resort.repositories;

import furama_resort.models.person.Customer;

import java.util.List;

public interface ICustomerRepository {
    List<Customer> getAll();

    boolean findCodeCustomer(String code);

    void addCustomer(Customer customer);

    void editCustomer(Customer customer);

    void removeCustomer(String code);

    List<Customer> searchByNameCustomer(String name);
}
