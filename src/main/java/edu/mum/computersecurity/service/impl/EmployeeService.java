/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.computersecurity.service.impl;

import edu.mum.computersecurity.domain.Employee;
import edu.mum.computersecurity.reposatory.impl.employeeReposatory;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author zeray
 */
@Service
@Transactional
public class EmployeeService {

    @Autowired
    private employeeReposatory er;

    public List<Employee> getEmployee() {
        return er.getList();
    }

    public void creatEmployee(Employee emp) {
        er.create(emp);
    }

    public Employee find(int id) {
        return (Employee) er.find(id);
    }
    
    public void update(Employee emp) {
        er.update(emp);
    }
    
    public void delete(int id){
        er.delete(id);
    }

}