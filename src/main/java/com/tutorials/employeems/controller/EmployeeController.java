package com.tutorials.employeems.controller;

import com.netflix.discovery.DiscoveryClient;
import com.tutorials.employeems.model.Department;
import com.tutorials.employeems.model.Employee;
import com.tutorials.employeems.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    EmployeeService service;

    @GetMapping("/")
    public List<Employee> getEmployees() {
        return new ArrayList<>();
    }

    @GetMapping("/{employeeId}")
    public Employee getEmployeeDetails(@PathVariable String employeeId) {
        return new Employee(1, "Random", new Department(002, "Accounts"));
    }

    @PostMapping("/{employeeId}")
    public String addEmployee(Employee employee) throws Exception {
        return service.addEmployee(employee);
    }
}
