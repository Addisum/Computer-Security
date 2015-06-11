/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.computersecurity.domain;

/**
 *
 * @author Addisu
 */
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class User {

    @Id
    @GeneratedValue
    private int userId;
    private String username;
    private String password;
    private boolean enabled;
    @OneToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

    public User() {
    }

    public User(String username, String password, boolean enabled, String authority, Employee employee) {
        this.username = username;
        this.password = password;
        this.enabled = enabled;
        this.employee = employee;
    }

    public String getUsername() {
        return username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    /**
     * @return the userId
     */
    public int getUserId() {
        return userId;
    }

    /**
     * @param userId the userId to set
     */
    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        String temp = "";
        temp += "username: " + username;
        temp += "\npassword: " + password;
        temp += "\nenabled: " + enabled;
        temp += "\nAddress: " + employee.getAddress();
        temp += "\nEmail: " + employee.getEmail();
        temp += "\nMobile: " + employee.getMobile();
        temp += "\nName: " + employee.getName();
        temp += "\nID: " + employee.getId();
        return temp;
    }

}
