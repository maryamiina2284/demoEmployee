package com.exampleEmployee;

import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeService {

    private final EmployeeRepository repo;
    //injection
    public EmployeeService(EmployeeRepository repo) {
        this.repo = repo;
    }
    public void insertEmployee(Employee employee){
        repo.save(employee);
    }
    public void updateEmployee(Employee employee){
        repo.save(employee);
    }
    public void deleteEmployee(Long id){
        repo.deleteById(id);
    }
    public Employee getEmployeeById(Long id){
        return repo.findById(id).orElse(null);
    }
    /// search
    public List<Employee> getAllEmployee(Long keyword){
        if(keyword != null)
            return repo.search(keyword);
        return repo.findAll();
    }
}
