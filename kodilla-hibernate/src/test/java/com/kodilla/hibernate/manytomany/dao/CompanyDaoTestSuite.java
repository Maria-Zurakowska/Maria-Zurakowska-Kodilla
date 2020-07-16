package com.kodilla.hibernate.manytomany.dao;
import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.facade.Facade;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import java.util.List;
@RunWith(SpringRunner.class)
@SpringBootTest
public class CompanyDaoTestSuite {
    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;
    @Autowired
    Facade facade;

    @Test
    public void testSaveManyToMany(){
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(johnSmith);
        dataMaesters.getEmployees().add(stephanieClarckson);
        dataMaesters.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaKovalsky);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        stephanieClarckson.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(greyMatter);
        //When
        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        companyDao.save(dataMaesters);
        int dataMaestersId = dataMaesters.getId();
        companyDao.save(greyMatter);
        int greyMatterId = greyMatter.getId();
        //Then
        Assert.assertNotEquals(0, softwareMachineId);
        Assert.assertNotEquals(0, dataMaestersId);
        Assert.assertNotEquals(0, greyMatterId);
        //CleanUp
        //try {
        //    companyDao.deleteById(softwareMachineId);
        //    companyDao.deleteById(dataMaestersId);
        //    companyDao.deleteById(greyMatterId);
        //} catch (Exception e) {
        //    //do nothing
        //}
    }
    @Test
    public void testRetrieveEmployeeBySurname(){
        //Given
        Employee emp1 = new Employee("Kate", "Smith");
        Employee emp2 = new Employee("Anne", "Brown");
        Employee emp3 = new Employee("Robert", "Kinney");

        employeeDao.save(emp1);
        employeeDao.save(emp2);
        employeeDao.save(emp3);
        //When
        List<Employee> employeeBySurname = employeeDao.retrieveEmployeeBySurname("Smith");
        //Then
        Assert.assertNotEquals(0, employeeBySurname.size());
    }
    @Test
    public void testRetrieveByFirstThreeLettersOfCompanyName(){
        //Given
        Company comp1 = new Company("Seagate");
        Company comp2 = new Company("Samsung");
        Company comp3 = new Company("Bosch");

        companyDao.save(comp1);
        companyDao.save(comp2);
        companyDao.save(comp3);
        //When
        List<Company> foundCompanies = companyDao.retrieveByFirstThreeLettersOfCompanyName("Sea");
        //Then
        Assert.assertNotEquals(0, foundCompanies.size());
    }

    @Test
    public void testRetrieveCompaniesNamesWhereNamesLikeParam(){
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(johnSmith);
        dataMaesters.getEmployees().add(stephanieClarckson);
        dataMaesters.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaKovalsky);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        stephanieClarckson.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(greyMatter);

        //When
        companyDao.save(softwareMachine);
        companyDao.save(dataMaesters);
        companyDao.save(greyMatter);

        employeeDao.save(johnSmith);
        employeeDao.save(stephanieClarckson);
        employeeDao.save(lindaKovalsky);

        List<Company> soft  = facade.retrieveCompaniesWhereNameLikeParam("Soft");
        List<Company> maest = facade.retrieveCompaniesWhereNameLikeParam("Maest");
        List<Company> matt = facade.retrieveCompaniesWhereNameLikeParam("Matt");

        //Then
        Assert.assertEquals(soft.get(0).getName(), softwareMachine.getName());
        Assert.assertEquals(maest.get(0).getName(), dataMaesters.getName());
        Assert.assertEquals(matt.get(0).getName(), greyMatter.getName());
    }
    @Test
    public void testRetrieveEmployeesNamesWhereNamesLikeParam(){
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(johnSmith);
        dataMaesters.getEmployees().add(stephanieClarckson);
        dataMaesters.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaKovalsky);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        stephanieClarckson.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(greyMatter);

        //When
        companyDao.save(softwareMachine);
        companyDao.save(dataMaesters);
        companyDao.save(greyMatter);

        employeeDao.save(johnSmith);
        employeeDao.save(stephanieClarckson);
        employeeDao.save(lindaKovalsky);

        List<Employee> smiths  = facade.retrieveEmployeesWhereNameLikeParam("Smith");
        List<Employee> clarcksons = facade.retrieveEmployeesWhereNameLikeParam("Clarckson");
        List<Employee> kovalskies = facade.retrieveEmployeesWhereNameLikeParam("Kovalsky");

        //Then
        Assert.assertEquals(smiths.get(0).getLastname(), johnSmith.getLastname());
        Assert.assertEquals(clarcksons.get(0).getLastname(), stephanieClarckson.getLastname());
        Assert.assertEquals(kovalskies.get(0).getLastname(), lindaKovalsky.getLastname());
    }

}