/**
 * 
 */
package com.leslie.repository;

/**
 * @author Administrator
 *
 */
public interface BaseDao<T,PK> {
     void save(T t);
     void updata(T t);
     void delete(T t );
     T getById(T t,PK id);
     }
