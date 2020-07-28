package com.thoughtworks.springbootemployee.service;

import com.thoughtworks.springbootemployee.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public interface EmployeeService {

    public void addEmployee(Employee employee);

    public List<Employee> getAllEmployee();

    public void deleteEmployee(int employeeId);

    public void updateEmployee(Employee employee);

    public void addEmployeeList(List<Employee> inputEmployeeList);

    public List<Employee> getCertainSexEmployee(String sex);

    public List<Employee> getPageOfEmployee(int page,int pageSize);

}