/**
 * 
 */
package com.leslie.repository.impl;

import java.io.Serializable;

import org.springframework.stereotype.Repository;

import com.leslie.entity.User;
import com.leslie.repository.UserDao;

/**
 * @author leslie
 * @time 2013-4-12
 */
@Repository("userDao")
public class UserDaoImpl<T extends Serializable, PK extends Serializable>
		extends BaseDaoImpl<T, PK> implements UserDao<T, PK> {

	@SuppressWarnings("unchecked")
	public T getById(T t, PK id) {
		// TODO Auto-generated method stub
		return (T) entityManager.find(t.getClass(), id);
	}

	public User getUserByName(String userName) {
		// TODO Auto-generated method stub
		return (User) entityManager
				.createQuery("from User u where u.userName='" + userName + "'");
	}

	public User getUserByNameAndPw(String userName, String passWord) {
		// TODO Auto-generated method stub
		return (User) entityManager
				.createQuery("from User u where u.userName='" + userName + "'"
						+ "and u.passWord='" + passWord + "'");
	}

}
