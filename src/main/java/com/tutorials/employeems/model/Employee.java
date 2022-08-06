package com.tutorials.employeems.model;

public class Employee {
    private Integer employeeId;
    private String employeeName;
    private Department department;

    public Employee(Integer employeeId, String employeeName, Department department) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.department = department;
    }
}
