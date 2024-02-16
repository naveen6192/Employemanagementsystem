package com.assessment.employemanagementsystem.controller;

import com.assessment.employemanagementsystem.entity.Employee;
import com.assessment.employemanagementsystem.service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Employee")
public class EmployeeController {
    @Autowired
    EmployeeServiceImpl esi;

    @PostMapping("/addemployee")
    public Employee addemployee(@RequestBody Employee employee) {
        return esi.addemployee(employee);
    }

    @GetMapping("/getallemployee")
    public List<Employee> getallemployee() {
        return esi.getallemployee();
    }

    @GetMapping("/getemployee/{id}")
    public Employee getemployee(@PathVariable int id) {
        return esi.getemployee(id);
    }

    @PutMapping("/updateemployee")
    public Employee updateemployee(@RequestBody Employee employee) {
        return esi.updateemployee(employee);
    }

    @DeleteMapping("/deleteemployee/{id}")
    public void deleteemployee(@PathVariable int id) {
        esi.deleteemployee(id);
    }
}
