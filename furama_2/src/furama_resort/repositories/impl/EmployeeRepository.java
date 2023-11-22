package furama_resort.repositories.impl;

import furama_resort.models.person.Employee;
import furama_resort.repositories.IEmployeeRepository;
import furama_resort.utils.read_and_write.employee.EmployeeReader;
import furama_resort.utils.read_and_write.employee.EmployeeWriter;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository {
    private static final String EMPLOYEE_PATH = "src/furama_resort/data/employee.csv";
    private static List<Employee> employees;
    @Override
    public void saveEmployee(Employee employee) {
        try {
            employees = EmployeeReader.read(EMPLOYEE_PATH);
            employees.add(employee);
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
        }
        EmployeeWriter.write(EMPLOYEE_PATH,employees);
    }

    @Override
    public List<Employee> getAll() {
        return EmployeeReader.read(EMPLOYEE_PATH);
    }

    @Override
    public boolean findCode(String code) {
        employees = EmployeeReader.read(EMPLOYEE_PATH);
        for (Employee employee: employees){
            if (employee.getCode().equals(code)){
                return true;
            }
        }
        return false;
    }

    @Override
    public void editEmployee(Employee employee) {
        employees = EmployeeReader.read(EMPLOYEE_PATH);
        for (Employee employee1: employees){
            if (employee1.getCode().equals(employee.getCode())){
                employee1.setName(employee.getName());
                employee1.setDateOfBirth(employee.getDateOfBirth());
                employee1.setGender(employee.getGender());
                employee1.setIdCard(employee.getIdCard());
                employee1.setPhoneNumber(employee.getPhoneNumber());
                employee1.setEmail(employee.getEmail());
                employee1.setLevel(employee.getLevel());
                employee1.setLocation(employee.getLocation());
                employee1.setWage(employee.getWage());
            }
        }
        EmployeeWriter.write(EMPLOYEE_PATH,employees);
    }

    @Override
    public void removeEmployee(String code) {
        employees = EmployeeReader.read(EMPLOYEE_PATH);
        for (Employee employee: employees){
            if (employee.getCode().equals(code)){
                employees.remove(employee);
                break;
            }
        }
        EmployeeWriter.write(EMPLOYEE_PATH,employees);
    }

    @Override
    public List<Employee> searchByName(String name) {
        employees = EmployeeReader.read(EMPLOYEE_PATH);
        List<Employee> list = new ArrayList<>();
        String employeeName;
        for (Employee employee: employees){
            employeeName = employee.getName().toLowerCase();
            if (employeeName.contains(name.toLowerCase())){
                list.add(employee);
            }
        }
        return list;
    }

    @Override
    public Employee getEmployee(String code) {
        employees = EmployeeReader.read(EMPLOYEE_PATH);
        for (Employee employee: employees){
            if (employee.getCode().equals(code)){
                return employee;
            }
        }
        return null;
    }
}
