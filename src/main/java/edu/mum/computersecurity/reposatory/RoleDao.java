/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.computersecurity.reposatory;
import edu.mum.computersecurity.domain.Role;
import java.util.List;
/**
 *
 * @author bayna_000
 */
public interface RoleDao {
    

    public void addRole(Role r);

    public void updateRole(Role r);

    public List<Role> getAllRoles();

    public Role getRoleById(int id);

    public void removeRole(int id);
}
