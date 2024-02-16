package com.assessment.employemanagementsystem.service;

import com.assessment.employemanagementsystem.entity.Employee;
import com.assessment.employemanagementsystem.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
    EmployeeRepository er;
    @Override
    public Employee addemployee(Employee employee) {
        return er.save(employee);
    }

    @Override
    public List<Employee> getallemployee() {
        return er.findAll();
    }

    @Override
    public Employee getemployee(int id) {
        return er.findById(id).orElse(null);
    }

    @Override
    public Employee updateemployee(Employee employee) {
        return er.save(employee);
    }

    @Override
    public void deleteemployee(int id) {
        er.deleteById(id);
    }
}
