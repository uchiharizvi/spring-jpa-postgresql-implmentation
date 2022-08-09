package com.tutorials.employeems.repository;

import com.tutorials.employeems.model.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {
    List<Employee> findByName(String name);
    Employee findById(long id);
}
