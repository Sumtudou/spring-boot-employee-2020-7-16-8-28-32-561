package com.thoughtworks.springbootemployee.entity;

import java.util.*;

public class Company {
    private int id;
    private String name;
    List<Employee> employeeList= new ArrayList<>();

    public void addEmployeeToCompany(Employee employee) {
        this.employeeList.add(employee);
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void clearAllEmployees() {
        employeeList.clear();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
