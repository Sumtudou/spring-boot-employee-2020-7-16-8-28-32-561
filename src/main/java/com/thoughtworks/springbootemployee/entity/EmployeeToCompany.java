package com.thoughtworks.springbootemployee.entity;

import java.util.*;

public class EmployeeToCompany {

    Map<Employee, Company> employeeCompanyMap = new HashMap<>();

    public void addRelation(Employee employee, Company company) {
        employeeCompanyMap.put(employee, company);
    }

    public List<Employee> getCertainCompanysEmployeeList(Company company) {
        List<Employee> employeeList = new ArrayList<>();
        Iterator it = employeeCompanyMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (entry.getValue().equals(company)) {
                //Object o = entry.getKey();
                employeeList.add((Employee) entry.getKey());
            }
        }
        return employeeList;
    }
}
