package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Repository
public interface EmployeeDao extends CrudRepository<Employee,Integer> {

    @Query
    List<Employee> retrieveEmployeeBySurname(@Param("LASTNAME")String lastname);

    //24.1 Facade pattern
    @Query
    List<Employee> retrieveEmployeesNamesWhereNamesLikeParam(@Param("name") String name);
}
