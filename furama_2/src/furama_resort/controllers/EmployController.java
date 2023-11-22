package furama_resort.controllers;

import furama_resort.models.person.Customer;
import furama_resort.models.person.Employee;
import furama_resort.services.IEmployeeService;
import furama_resort.services.impl.EmployeeService;

import java.util.List;

public class EmployController {
    private IEmployeeService employeeService = new EmployeeService();
    public void addEmployee(Employee employee) {
        employeeService.addNewEmployee(employee);
    }


    public List<Employee> getAll() {
        return employeeService.getAll();
    }

    public boolean findCode(String code) {
        return employeeService.findCode(code);
    }

    public void editEmployee(Employee employee) {
        employeeService.editEmployee(employee);
    }

    public void removeEmployee(String code) {
        employeeService.removeEmployee(code);
    }


    public List<Employee> searchByName(String name) {
        return employeeService.searchByName(name);
    }


    public Employee getEmployee(String code) {
        return employeeService.getEmployee(code);
    }
}
