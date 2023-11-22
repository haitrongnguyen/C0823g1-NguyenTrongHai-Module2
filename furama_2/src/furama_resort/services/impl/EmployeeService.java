package furama_resort.services.impl;

import furama_resort.models.person.Employee;
import furama_resort.repositories.IEmployeeRepository;
import furama_resort.repositories.impl.EmployeeRepository;
import furama_resort.services.IEmployeeService;

import java.util.List;

public class EmployeeService implements IEmployeeService {
    private IEmployeeRepository employeeRepository = new EmployeeRepository();
    @Override
    public void addNewEmployee(Employee employee) {
        employeeRepository.saveEmployee(employee);

    }

    @Override
    public List<Employee> getAll() {
        return employeeRepository.getAll();
    }

    @Override
    public boolean findCode(String code) {
        return employeeRepository.findCode(code);
    }

    @Override
    public void editEmployee(Employee employee) {
        employeeRepository.editEmployee(employee);
    }

    @Override
    public void removeEmployee(String code) {
        employeeRepository.removeEmployee(code);
    }

    @Override
    public List<Employee> searchByName(String name) {
        return employeeRepository.searchByName(name);
    }

    @Override
    public Employee getEmployee(String code) {
        return employeeRepository.getEmployee(code);
    }
}
