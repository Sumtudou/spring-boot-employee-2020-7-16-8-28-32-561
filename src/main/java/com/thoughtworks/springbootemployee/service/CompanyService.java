package com.thoughtworks.springbootemployee.service;

import com.thoughtworks.springbootemployee.entity.Company;
import com.thoughtworks.springbootemployee.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface CompanyService {
    public void addCompany(Company company);

    public List<Company> getAllCompany();

    public void deleteCompany(int companyId);

    public void updateCompany(Company company);

    public Company getCertainCompany(int CompanyId);


    public void joinAEmployee(Company company,Employee employee);

    public void clearAllEmployee(Company company);


    public void addcompanyList(List<Company> inputCompanyList);
}
