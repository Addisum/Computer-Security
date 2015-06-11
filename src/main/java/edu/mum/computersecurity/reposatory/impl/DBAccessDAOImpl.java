/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.computersecurity.reposatory.impl;

import edu.mum.computersecurity.reposatory.IDBAccessDAO;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 *
 */
@Repository
@Transactional
public class DBAccessDAOImpl implements IDBAccessDAO{

    @Autowired
    private SessionFactory SessionFactory;
    
    
    
    @Override
    public <T> void create(T t) {
        SessionFactory.getCurrentSession().persist(t);
    }

    @Override
    public <T> void delete(T t) {
        
    }

    @Override
    public <T> List<T> getList(T t) {
        //List<Sprint>sprints = new ArrayList<Sprint>();
        String query = "select * from mumscrum.sprint";
        
        SessionFactory.getCurrentSession().createQuery(query);//"from");
        return null;
    }

    @Override
    public <T> T getById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public <T> List<T> getByQuery() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
          
}
