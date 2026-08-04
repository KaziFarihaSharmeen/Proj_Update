package com.example.employeecrud.Repository;


import com.example.employeecrud.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EmployeeRepository
        extends JpaRepository<Employee,Integer> {


}