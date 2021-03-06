package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Facade {

    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;

    public List<Company> retrieveCompaniesWhereNameLikeParam(String name) {
        return companyDao.retrieveCompaniesNamesWhereNamesLikeParam(name);
    }

    public List<Employee> retrieveEmployeesWhereNameLikeParam(String param) {
        return employeeDao.retrieveEmployeesNamesWhereNamesLikeParam(param);


    }
}