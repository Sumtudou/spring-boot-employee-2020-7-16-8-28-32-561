package com.thoughtworks.springbootemployee.service.serviceImpl;

import com.thoughtworks.springbootemployee.entity.Company;
import com.thoughtworks.springbootemployee.entity.Employee;
import com.thoughtworks.springbootemployee.service.CompanyService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyServiceImpl implements CompanyService {

    @Override
    public void addCompany(Company company) {

    }

    @Override
    public List<Employee> getAllCompany() {
        return null;
    }

    @Override
    public void deleteCompany(int companyId) {

    }

    @Override
    public void updateCompany(Company company) {

    }
}
