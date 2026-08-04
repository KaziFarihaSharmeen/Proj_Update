package com.example.employeecrud.Controller;


import com.example.employeecrud.Entity.Employee;
import com.example.employeecrud.Service.EmployeeService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class EmployeeController {



    private EmployeeService service;



    public EmployeeController(EmployeeService service){

        this.service=service;

    }



    @GetMapping("/")
    public String viewEmployees(Model model){

        model.addAttribute(
                "employees",
                service.getAllEmployees()
        );

        return "employees";

    }



    @GetMapping("/add")
    public String addEmployee(Model model){

        Employee employee=new Employee();

        model.addAttribute(
                "employee",
                employee
        );

        return "add_employee";

    }



    @PostMapping("/save")
    public String saveEmployee(
            @ModelAttribute Employee employee
    ){

        service.saveEmployee(employee);

        return "redirect:/";

    }



    @GetMapping("/edit/{id}")
    public String editEmployee(
            @PathVariable int id,
            Model model
    ){

        model.addAttribute(
                "employee",
                service.getEmployeeById(id)
        );


        return "edit_employee";

    }



    @GetMapping("/delete/{id}")
    public String deleteEmployee(
            @PathVariable int id
    ){

        service.deleteEmployee(id);


        return "redirect:/";

    }
    @GetMapping("/view/{id}")
    public String viewEmployee(
            @PathVariable int id,
            Model model
    ){

        Employee employee = service.getEmployeeById(id);

        model.addAttribute(
                "employee",
                employee
        );

        return "employee_details";
    }


}