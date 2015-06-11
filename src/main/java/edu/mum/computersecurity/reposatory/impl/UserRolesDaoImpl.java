/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.computersecurity.reposatory.impl;

import edu.mum.computersecurity.domain.UserRoles;
import edu.mum.computersecurity.reposatory.UserRoleDao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

/**
 *
 * @author bayna_000
 */
@Repository
@Transactional
public class UserRolesDaoImpl implements UserRoleDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addUserRole(UserRoles ur) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(ur);
    }

    @Override
    public void updateUserRole(UserRoles ur) {
        Session session = this.sessionFactory.getCurrentSession();
        session.update(ur);
    }

    @Override
    public List<UserRoles> getAllUserRoles() {
        Session session = this.sessionFactory.getCurrentSession();
        List<UserRoles> userRoleList = (List<UserRoles>) session.createQuery("from UserRoles").list();
        return userRoleList;
    }

    @Override
    public UserRoles getUserRolesById(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        UserRoles ur = (UserRoles) session.load(UserRoles.class, id);
        return ur;
    }

    @Override
    public void removeUserRoles(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        UserRoles ur = (UserRoles) session.load(UserRoles.class, id);
        session.delete(ur);
    }

}
