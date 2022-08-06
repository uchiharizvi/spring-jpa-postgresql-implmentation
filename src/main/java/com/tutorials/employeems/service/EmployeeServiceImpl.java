package com.tutorials.employeems.service;

import com.tutorials.employeems.model.Department;
import com.tutorials.employeems.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Override
    public List<Employee> getEmployees() throws Exception {
        return new ArrayList<>();
    }

    @Override
    public String addEmployee(Employee employee) throws Exception {
        return "201 Created";
    }
}
