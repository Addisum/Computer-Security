/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.computersecurity.reposatory.impl;

import edu.mum.computersecurity.domain.Role;
import edu.mum.computersecurity.reposatory.RoleDao;
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
public class RoleDaoImpl implements RoleDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addRole(Role r) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(r);
    }

    @Override
    public void updateRole(Role r) {
        Session session = this.sessionFactory.getCurrentSession();
        session.update(r);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Role> getAllRoles() {
        Session session = this.sessionFactory.getCurrentSession();
        List<Role> roleList = (List<Role>) session.createQuery("from Role").list();
        return roleList;
    }

    @Override
    public Role getRoleById(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        Role r = (Role) session.load(Role.class, id);
        return r;
    }

    @Override
    public void removeRole(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        Role r = (Role) session.load(Role.class, id);
        session.delete(r);
    }

}
