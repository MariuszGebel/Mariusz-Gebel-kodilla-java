package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ManyToManyFacadeTestSuite {

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    @Autowired
    private ManyToManyFacade manyToManyFacade;

    @Test
    public void testRetrieveCompanyNameContaining(){
        //Given
        Company c1 = new Company("Software Machine");
        Company c2 = new Company("Software Masters");
        Company c3 = new Company("Grey Hardware");
        Company c4 = new Company("Sotfwares");
        Company c5 = new Company("Softwares");

        //When
        companyDao.save(c1);
        companyDao.save(c2);
        companyDao.save(c3);
        companyDao.save(c4);
        companyDao.save(c5);
        List<Company> numberOfCompanies = companyDao.retriveCampanyNameContaining("Software");
        int numberOfCompanies1 = manyToManyFacade.getCompanyNamesContaining("Sotfware").size();

        //Then
        Assert.assertEquals(3, numberOfCompanies.size());
        Assert.assertEquals(1, numberOfCompanies1);

        //CleanUp
        try {
            companyDao.delete(c1);
            companyDao.delete(c2);
            companyDao.delete(c3);
            companyDao.delete(c4);
            companyDao.delete(c5);
        } catch (Exception e) {
//            do nothing;
        }
    }

    @Test
    public void testRetrieveEmployeeNameContaining(){
        //Given
        Employee e1 = new Employee("Jan", "Kowalski");
        Employee e2 = new Employee("Dorota", "Nowak");
        Employee e3 = new Employee("Wiktor", "Piotrowski");
        Employee e4 = new Employee("Franciszek", "Jaworski");
        Employee e5 = new Employee("Ewa", "Jankowska");
        Employee e6 = new Employee("Edward", "Jankowski");

        //When
        employeeDao.save(e1);
        employeeDao.save(e2);
        employeeDao.save(e3);
        employeeDao.save(e4);
        employeeDao.save(e5);
        employeeDao.save(e6);
        List<Employee> numberOfEmployees = employeeDao.retrieveEmployeesNamesContaining("ski");
        int numberOfEmployees1 = manyToManyFacade.getEmployeeNamesContaining("wski").size();

        //Then
        Assert.assertEquals(4, numberOfEmployees.size());
        Assert.assertEquals(2, numberOfEmployees1);

        //CleanUp
        try {
            employeeDao.delete(e1);
            employeeDao.delete(e2);
            employeeDao.delete(e3);
            employeeDao.delete(e4);
            employeeDao.delete(e5);
            employeeDao.delete(e6);
        } catch (Exception e) {
//            do nothing;
        }
    }

}
