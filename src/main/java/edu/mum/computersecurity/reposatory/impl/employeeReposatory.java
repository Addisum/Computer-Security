/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.computersecurity.reposatory.impl;

import edu.mum.computersecurity.domain.Employee;
import edu.mum.computersecurity.reposatory.GenericDaoImpl;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author zeray
 */
@Repository
@Transactional
public class employeeReposatory extends GenericDaoImpl<Employee>{
    
}