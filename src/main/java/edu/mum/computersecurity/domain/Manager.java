/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.computersecurity.domain;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

/**
 *
 *\
 */
@Entity
public class Manager {
   
   @Id @GeneratedValue 
   private int id;
   

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


   
}
