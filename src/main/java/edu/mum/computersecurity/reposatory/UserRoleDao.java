/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.computersecurity.reposatory;

import edu.mum.computersecurity.domain.UserRoles;
import java.util.List;
/**
 *
 * @author bayna_000
 */
public interface UserRoleDao {
    

    public void addUserRole(UserRoles ur);

    public void updateUserRole(UserRoles ur);

    public List<UserRoles> getAllUserRoles();

    public UserRoles getUserRolesById(int id);

    public void removeUserRoles(int id);
}
