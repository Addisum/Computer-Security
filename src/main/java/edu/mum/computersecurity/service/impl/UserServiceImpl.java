/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.computersecurity.service.impl;
import java.util.List;
import edu.mum.computersecurity.domain.User;
import edu.mum.computersecurity.reposatory.IUserDao;
import edu.mum.computersecurity.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author bayna_000
 */
@Service
@Transactional
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserDao userDao;

    @Override
    public void addUser(User u) {
        this.userDao.addUser(u);
    }

    @Override
    public void updateUser(User u) {
        this.userDao.updateUser(u);
    }

    @Override
    public List<User> getAllUsers() {
        return this.userDao.getAllUsers();
    }

    @Override
    public User getUserById(int id) {
        return this.userDao.getUserById(id);
    }

    @Override
    public void removeUser(int id) {
        this.userDao.removeUser(id);
    }
}
