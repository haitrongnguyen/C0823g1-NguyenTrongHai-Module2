package furama_resort.repositories;

import furama_resort.models.person.Employee;

import java.util.List;

public interface IEmployeeRepository {
    void saveEmployee(Employee employee);

    List<Employee> getAll();

    boolean findCode(String code);

    void editEmployee(Employee employee);

    void removeEmployee(String code);

    List<Employee> searchByName(String name);
}
