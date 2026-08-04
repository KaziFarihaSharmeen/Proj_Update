package com.example.employeecrud.Service;


import com.example.employeecrud.Entity.Employee;
import com.example.employeecrud.Repository.EmployeeRepository;

import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class EmployeeServiceImpl
        implements EmployeeService {


    private EmployeeRepository repository;


    public EmployeeServiceImpl(EmployeeRepository repository){
        this.repository = repository;
    }



    @Override
    public List<Employee> getAllEmployees(){

        return repository.findAll();

    }



    @Override
    public void saveEmployee(Employee employee){

        repository.save(employee);

    }



    @Override
    public Employee getEmployeeById(int id){

        return repository.findById(id).get();

    }



    @Override
    public void deleteEmployee(int id){

        repository.deleteById(id);

    }

}