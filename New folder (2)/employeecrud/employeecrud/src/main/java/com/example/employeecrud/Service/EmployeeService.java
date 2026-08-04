package com.example.employeecrud.Service;


import com.example.employeecrud.Entity.Employee;

import java.util.List;


public interface EmployeeService {


    List<Employee> getAllEmployees();


    void saveEmployee(Employee employee);


    Employee getEmployeeById(int id);


    void deleteEmployee(int id);

}