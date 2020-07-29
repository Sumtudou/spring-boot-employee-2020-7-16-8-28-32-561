package com.thoughtworks.springbootemployee.service;

import com.thoughtworks.springbootemployee.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

public interface EmployeeService {

    void addEmployee(Employee employee);

    List<Employee> getAllEmployee();

    void deleteEmployee(int employeeId);

    void updateEmployee(Employee employee);

    void addEmployeeList(List<Employee> inputEmployeeList);

    List<Employee> getCertainGenderEmployee(String sex);

    List<Employee> getPageOfEmployee(int page, int pageSize);

}