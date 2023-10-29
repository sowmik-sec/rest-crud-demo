package com.sowmik.restcruddemo.service;

import com.sowmik.restcruddemo.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();
}
