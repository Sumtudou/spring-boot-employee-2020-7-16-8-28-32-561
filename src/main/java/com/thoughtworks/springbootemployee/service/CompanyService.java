package com.thoughtworks.springbootemployee.service;

import com.thoughtworks.springbootemployee.entity.Company;
import com.thoughtworks.springbootemployee.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

public interface CompanyService {
    void addCompany(Company company);

    List<Company> getAllCompany();

    void deleteCompany(int companyId);

    void updateCompany(Company company);

    Company getCertainCompany(int CompanyId);


    void joinAEmployee(Company company, Employee employee);

    void clearAllEmployee(Company company);


    void addcompanyList(List<Company> inputCompanyList);
}
