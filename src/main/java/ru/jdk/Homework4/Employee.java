package ru.jdk.Homework4;

public class Employee {

    private final int empId;
    private final String phoneNumber;
    private final String name;
    private final int experience;

    public Employee(int empId, String phoneNumber, String name, int experience) {
        this.empId = empId;
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.experience = experience;
    }

    public int getEmpId() {
        return empId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getName() {
        return name;
    }

    public int getExperience() {
        return experience;
    }

}
