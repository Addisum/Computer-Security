/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.computersecurity.service.impl;
import edu.mum.computersecurity.domain.User;
import edu.mum.computersecurity.domain.UserRoles;
import edu.mum.computersecurity.reposatory.UserRoleDao;
import java.util.List;
import edu.mum.computersecurity.service.IUserService;
import edu.mum.computersecurity.service.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Addisu
 */
@Service
@Transactional
public class UserRoleServiceImpl implements UserRoleService {

    @Autowired
    private UserRoleDao userRoleDao;


    @Override
    public void addUserRole(UserRoles ur) {
        this.userRoleDao.addUserRole(ur);
    }

    @Override
    public void updateUserRole(UserRoles ur) {
        this.userRoleDao.updateUserRole(ur);
    }

    @Override
    public List<UserRoles> getAllUserRoles() {
        return this.userRoleDao.getAllUserRoles();
    }

    @Override
    public UserRoles getUserRolesById(int id) {
         return this.userRoleDao.getUserRolesById(id);
    }

    @Override
    public void removeUserRoles(int id) {
        this.userRoleDao.removeUserRoles(id);
    }
    
}
