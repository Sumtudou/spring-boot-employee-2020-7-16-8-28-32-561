package com.thoughtworks.springbootemployee.controller;

import com.thoughtworks.springbootemployee.entity.Employee;
import com.thoughtworks.springbootemployee.service.serviceImpl.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeServiceImpl employeeService;

    @GetMapping(path = "/employees")
    public List<Employee> getPageList(@RequestParam(required = false) Integer page,
                                      @RequestParam(required = false) Integer pageSize,
                                      @RequestParam(required = false) String gender) {
        if (page == null || pageSize == null) {
            return employeeService.getAllEmployee();
        }
        if (gender != null) {
            return employeeService.getCertainSexEmployee(gender);
        }
        return employeeService.getPageOfEmployee(page, pageSize);
    }


    @PostMapping(path = "/employees")
    public void addEmployee(@RequestBody Employee employee) {
        employeeService.addEmployee(employee);
    }

//    @PutMapping(path = "/employees/{id}")
//    public void updateEmployee(@PathVariable int id, @RequestBody Employee employee) {
//        employeeService.updateEmployee(employee);
//    }



    @PutMapping(path = "/employees")
    public void updateEmployee(@RequestBody Employee employee) {
        employeeService.updateEmployee(employee);
    }

    @DeleteMapping(path = "/employees/{employeeId}")
    public void deleteEmployee(@PathVariable int employeeId) {
        employeeService.deleteEmployee(employeeId);
    }

    @PostMapping(path = "/employeeslist")
    public void addEmployeeList(@RequestBody List<Employee> inputEmployeeList) {
        employeeService.addEmployeeList(inputEmployeeList);
    }

}