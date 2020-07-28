package com.thoughtworks.springbootemployee.controller;

import com.thoughtworks.springbootemployee.entity.Company;
import com.thoughtworks.springbootemployee.entity.Employee;
import com.thoughtworks.springbootemployee.service.CompanyService;
import com.thoughtworks.springbootemployee.service.serviceImpl.CompanyServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CompanyController {
    @Autowired
    CompanyServiceImpl companyService;

    @GetMapping(path = "/companies")
    public List<Company> getAll() {
        return companyService.getAllCompany();
    }

    @GetMapping(path = "/companies/{companyId}")
    public Company getCertainCompany(@PathVariable int companyId) {
        return companyService.getCertainCompany(companyId);
    }

    @GetMapping(path = "/companies/{companyId}/employees")
    public List<Employee> getCertainCompanyEmployee(@PathVariable int companyId) {
        return getCertainCompany(companyId).getEmployeeList();
    }


    @PostMapping(path = "/companies")
    public void addEmployee(@RequestBody Company company){
        companyService.addCompany(company);
    }

    @PostMapping(path = "/join/{companyId}")
    public void addEmployee(@RequestBody Employee employee , @PathVariable int companyId){
        Company company = companyService.getCertainCompany(companyId);
        company.addEmployeeToCompany(employee);
    }


    @PutMapping(path = "/companies")
    public void updateEmployee(@RequestBody Company company){
        companyService.updateCompany(company);
    }

    @DeleteMapping(path = "/companies/{companyId}")
    public void deleteEmployee(@PathVariable int companyId){
        Company company = companyService.getCertainCompany(companyId);
        companyService.clearAllEmployee(company);
    }

    @PostMapping(path = "/companylist")
    public void addCompanyList(@RequestBody List<Company> inputCompanyList){
        companyService.addcompanyList(inputCompanyList);
    }

}
