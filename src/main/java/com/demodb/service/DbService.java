package com.demodb.service;

import com.demodb.entities.Employee;
import com.demodb.repository.DbRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DbService
{
    @Autowired
    DbRepository repo;
    List<Employee> emp = new ArrayList<>();
    public void addEmployee(Employee employee)
    {
        repo.save(employee);
    }

    public List<Employee> getAllEmployee()
    {
        return repo.findAll();
    }

}
