package com.thoughtworks.springbootemployee.service.serviceImpl;

import com.thoughtworks.springbootemployee.entity.Employee;
import com.thoughtworks.springbootemployee.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private List<Employee> employeeList = new ArrayList<>();

    public void addEmployee(Employee employee) {
        employeeList.add(employee);
    }

    public List<Employee> getAllEmployee() {
        return employeeList;
    }

    public void deleteEmployee(int employeeId) {
        employeeList.removeIf(employee -> employee.getId() == employeeId);
    }

    public void updateEmployee(Employee employee) {
        employeeList.remove(employee.getId());
        employeeList.add(employee);
    }

    public void addEmployeeList(List<Employee> inputEmployeeList) {
        employeeList.addAll(inputEmployeeList);
    }

    @Override
    public List<Employee> getCertainSexEmployee(String sex) {
        List<Employee> employeeMaleList = new ArrayList<>();
        for (Employee employee : employeeList) {
            if (employee.getGender().equals(sex)) {
                employeeMaleList.add(employee);
            }
        }
        return employeeMaleList;
    }

    @Override
    public List<Employee> getPageOfEmployee(int page, int pageSize) {
        List<Employee> employeePageList = new ArrayList<>();
        int length = employeeList.size();
        int startIndex = (page - 1) * pageSize;
        if (startIndex > length - 1)
            return null;
        int endIndex = Math.min(length - 1, page * pageSize - 1);
        for (int i = startIndex; i <= endIndex; i++) {
            employeePageList.add(employeeList.get(i));
        }
        return employeePageList;
    }
}