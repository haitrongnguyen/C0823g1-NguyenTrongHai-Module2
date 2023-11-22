package furama_resort.services;

import furama_resort.models.person.Employee;

import java.util.List;

public interface IEmployeeService {
    void addNewEmployee(Employee employee);

    List<Employee> getAll();

    boolean findCode(String code);

    void editEmployee(Employee employee);

    void removeEmployee(String code);

    List<Employee> searchByName(String name);

    Employee getEmployee(String code);
}
