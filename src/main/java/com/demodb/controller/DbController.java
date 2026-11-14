package com.demodb.controller;

import com.demodb.entities.Employee;
import com.demodb.service.DbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DbController {

    @Autowired
    DbService dbservice;
    @GetMapping("/home")
    public String home()
    {
        return "Hello wwWorld!\n";
    }

    @PostMapping("/addName")
    public void addEmployee(@RequestBody Employee employee)
    {
       dbservice.addEmployee(employee);
    }

    @GetMapping("/getAllEmployees")
    public List<Employee> getAllEmployee()
    {
        return dbservice.getAllEmployee();
    }


}
