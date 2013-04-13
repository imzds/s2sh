/**
 * 
 */
package com.leslie.repository;

import com.leslie.entity.User;

/**
 * @author leslie
 * @time  2013-4-12
 */
public interface UserDao<T,PK> extends BaseDao<T,PK> {
     User getUserByName(final String userName);
     User getUserByNameAndPw(final String userName,String passWord);
}
