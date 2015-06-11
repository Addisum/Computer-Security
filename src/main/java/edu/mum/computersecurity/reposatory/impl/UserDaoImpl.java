/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.computersecurity.reposatory.impl;

import edu.mum.computersecurity.domain.User;
import edu.mum.computersecurity.reposatory.IUserDao;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author bayna_000
 */
@Repository
@Transactional
public class UserDaoImpl implements IUserDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addUser(User u) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(u);
    }

    @Override
    public void updateUser(User u) {
        Session session = this.sessionFactory.getCurrentSession();
        session.update(u);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<User> getAllUsers() {
        Session session = this.sessionFactory.getCurrentSession();
        List<User> userList = (List<User>) session.createQuery("from User").list();
        return userList;
    }

    @Override
    public User getUserById(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        User u = (User) session.load(User.class, id);
        return u;
    }

    @Override
    public void removeUser(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        User u = (User) session.load(User.class, id);
        session.delete(u);
    }

}
