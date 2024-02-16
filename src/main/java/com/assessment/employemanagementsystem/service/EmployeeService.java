package com.assessment.employemanagementsystem.service;

import com.assessment.employemanagementsystem.entity.Employee;

import java.util.List;

public interface EmployeeService {
    public Employee addemployee(Employee employee);

    public List<Employee> getallemployee();

    public Employee getemployee(int id);

    public Employee updateemployee(Employee employee);

    public void deleteemployee(int id);
}
