package com.thoughtworks.springbootemployee.service.serviceImpl;

import com.thoughtworks.springbootemployee.entity.Company;
import com.thoughtworks.springbootemployee.entity.Employee;
import com.thoughtworks.springbootemployee.service.CompanyService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CompanyServiceImpl implements CompanyService {
    List<Company> companyList = new ArrayList<>();

    @Override
    public void addCompany(Company company) {
        companyList.add(company);
    }


    // TODO build a company ,and join employee

    @Override
    public List<Company> getAllCompany() {
        return companyList;
    }

    @Override
    public Company getCertainCompany(int companyId) {
        for(Company company:companyList){
            if(company.getId() == companyId)
                return company;
        }
        return null;
    }

    @Override
    public void joinAEmployee(Company company,Employee employee) {
        for(Company company1:companyList){
            if(company1.equals(company)){
                company.addEmployeeToCompany(employee);
            }
        }
    }

    @Override
    public void clearAllEmployee(Company company) {
        company.clearAllEmployees();
    }

    @Override
    public void addcompanyList(List<Company> inputCompanyList) {
        companyList.addAll(inputCompanyList);
    }

    @Override
    public void deleteCompany(int companyId) {
        companyList.removeIf(company -> company.getId() == companyId);
    }

    @Override
    public void updateCompany(Company company) {
        deleteCompany(company.getId());
        companyList.add(company);
    }
}
