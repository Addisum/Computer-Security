package edu.mum.computersecurity.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.validator.constraints.*;


@Entity
public class Employee {

    @Id
    @GeneratedValue
    private int id;
    @NotEmpty(message = "Name should not be empty")
    private String Name;
//    @NotEmpty(message = "Name should not be empty")
    private String Mobile;
    @NotEmpty(message = "Email should not be empty") @Email 
    private String Email;
    private String Address;
    @Temporal(TemporalType.DATE)
    private Date DateOfBirth;

    public Employee() {
    }

//    public Employee(String Name, String Mobile, String Email, String Address, Date DateOfBirth) {
//        this.Name = Name;
//        this.Mobile = Mobile;
//        this.Email = Email;
//        this.Address = Address;
//        this.DateOfBirth = DateOfBirth;
//    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getMobile() {
        return Mobile;
    }

    public void setMobile(String Mobile) {
        this.Mobile = Mobile;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public Date getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(Date DateOfBirth) {
        this.DateOfBirth = DateOfBirth;
    }

}
