package com.sowmik.restcruddemo.dao;

import com.sowmik.restcruddemo.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> findAll();
}
