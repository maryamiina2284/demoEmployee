package com.exampleEmployee;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {
    @Query(value="Select * from employee where id =?1", nativeQuery = true)
    public List<Employee> search(@Param("keyword") Long id);
}
