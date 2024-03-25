package ru.jdk.Homework4;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService {

    private final List<Employee> employees;

    public EmployeeService() {
        employees = new ArrayList<>();
    }

    public void addEmployee(int empId, String phoneNumber, String name, int experience) {
        Employee employee = new Employee(empId, phoneNumber, name, experience);
        employees.add(employee);
    }

    public List<Employee> findByExperience(int experience) {
        List<Employee> foundEmployees = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getExperience() == experience) {
                foundEmployees.add(employee);
            }
        }
        return foundEmployees;
    }

    public List<String> findPhoneByName(String name) {
        List<String> phoneNumbers = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getName().equals(name)) {
                phoneNumbers.add(employee.getPhoneNumber());
            }
        }
        return phoneNumbers;
    }

    public Employee findByEmpId(int empId) {
        for (Employee employee : employees) {
            if (employee.getEmpId() == empId) {
                return employee;
            }
        }
        return null;
    }

}