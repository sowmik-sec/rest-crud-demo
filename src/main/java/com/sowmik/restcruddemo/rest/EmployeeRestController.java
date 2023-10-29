package com.sowmik.restcruddemo.rest;

import com.sowmik.restcruddemo.dao.EmployeeDAO;
import com.sowmik.restcruddemo.entity.Employee;
import com.sowmik.restcruddemo.service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {
    private EmployeeService employeeService;
    // quick and dirty: inject employee dao (use constructor injection
    public EmployeeRestController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    // expose "/employees" and return a list of employees
    @GetMapping("/employees")
    public List<Employee> findAll() {
        return employeeService.findAll();
    }
}
