/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.computersecurity.reposatory;

import java.util.List;


public interface IDBAccessDAO {
    public <T> void create(T t);
    public <T> void delete(T t);
    
    public <T> List<T> getList(T t);
    
    //gez
    
    public <T> T getById(int id);
    public <T> List<T> getByQuery();
    
}
