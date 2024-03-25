package ru.jdk.Homework4;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        EmployeeService employees = new EmployeeService();

        employees.addEmployee(1, "8999-111-1111", "Иван Иванов", 6);
        employees.addEmployee(2, "8999-222-2222", "Петр Петров", 3);
        employees.addEmployee(3, "8999-333-3333", "Сергей Сергеев", 6);
        employees.addEmployee(4, "8999-444-4444", "Николай Николаев", 2);

        System.out.println("Поиск сотрудников со стажем 6 лет:");
        List<Employee> employeesExperience = employees.findByExperience(6);
        for (Employee employee : employeesExperience) {
            System.out.println(employee.getName());
        }

        System.out.println("Номер телефона Сергея Сергеева:");
        List<String> phoneNumbers = employees.findPhoneByName("Сергей Сергеев");
        for (String phoneNumber : phoneNumbers) {
            System.out.println(phoneNumber);
        }

    }

}
