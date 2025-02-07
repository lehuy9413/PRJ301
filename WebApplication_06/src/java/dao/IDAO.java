/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;

/**
 *
 * @author lehuy
 */
public interface IDAO <T, K>{
    boolean create(T entity);
    List<T> readALL();
    T readyID(K id);
    boolean update(T entity);
    boolean delete(K id);
    List<T> search(String searchTerm);
    
}
