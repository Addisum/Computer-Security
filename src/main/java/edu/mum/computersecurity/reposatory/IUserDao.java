/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.computersecurity.reposatory;

import edu.mum.computersecurity.domain.User;
import java.util.List;

/**
 *
 * @author bayna_000
 */
public interface IUserDao {

    public void addUser(User u);

    public void updateUser(User u);

    public List<User> getAllUsers();

    public User getUserById(int id);

    public void removeUser(int id);
}
