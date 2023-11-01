package furama_resort.repositories.impl;

import furama_resort.models.person.Employee;
import furama_resort.repositories.IEmployeeRepository;
import furama_resort.utils.read_and_write.Read;
import furama_resort.utils.read_and_write.Write;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository {
    private static final String EMPLOYEE_PATH = "src/furama_resort/data/employee.csv";
    private static List<Employee> employees;
    @Override
    public void saveEmployee(Employee employee) {
        employees.add(employee);
        Write.write(EMPLOYEE_PATH,employees);
    }

    @Override
    public List<Employee> getAll() {
        return Read.read(EMPLOYEE_PATH);
    }

    @Override
    public boolean findCode(String code) {
        employees = Read.read(EMPLOYEE_PATH);
        for (Employee employee: employees){
            if (employee.getCode().equals(code)){
                return true;
            }
        }
        return false;
    }

    @Override
    public void editEmployee(Employee employee) {
        employees = Read.read(EMPLOYEE_PATH);
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
        Write.write(EMPLOYEE_PATH,employees);
    }

    @Override
    public void removeEmployee(String code) {
        employees = Read.read(EMPLOYEE_PATH);
        for (Employee employee: employees){
            if (employee.getCode().equals(code)){
                employees.remove(employee);
                break;
            }
        }
        Write.write(EMPLOYEE_PATH,employees);
    }

    @Override
    public List<Employee> searchByName(String name) {
        employees = Read.read(EMPLOYEE_PATH);
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
}
