package com.tutorials.employeems.service;

import com.tutorials.employeems.model.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getEmployees() throws Exception;
    String addEmployee(Employee employee) throws Exception;
}
