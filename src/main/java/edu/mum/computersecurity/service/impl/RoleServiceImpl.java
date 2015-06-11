/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.computersecurity.service.impl;

import edu.mum.computersecurity.domain.Role;
import edu.mum.computersecurity.reposatory.RoleDao;
import edu.mum.computersecurity.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

/**
 *
 * @author bayna_000
 */
@Service
@Transactional
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleDao roleDao;

    @Override
    public void addRole(Role r) {
        this.roleDao.addRole(r);
    }

    @Override
    public void updateRole(Role r) {
        this.roleDao.updateRole(r);
    }

    @Override
    public List<Role> getAllRoles() {
        return this.roleDao.getAllRoles();
    }

    @Override
    public Role getRoleById(int id) {
        return this.roleDao.getRoleById(id);
    }

    @Override
    public void removeRole(int id) {
        this.roleDao.removeRole(id);
    }

}
