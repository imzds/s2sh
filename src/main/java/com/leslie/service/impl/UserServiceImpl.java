/**
 * 
 */
package com.leslie.service.impl;

import java.io.Serializable;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.leslie.entity.User;
import com.leslie.repository.UserDao;
import com.leslie.service.UserService;

/**
 * @author leslie
 * @time 2013-4-12
 */
@Service("userService")
public class UserServiceImpl<T extends Serializable, PK extends Serializable>
		extends BaseServiceImpl<T, PK> implements UserService<T, PK> {
  
	 private UserDao userDao;
	 
    @Inject
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public User getUserByName(String userName) {
		// TODO Auto-generated method stub
		return userDao.getUserByName(userName);
	}

	public User getUserByNameAndPw(String userName, String passWord) {
		// TODO Auto-generated method stub
		return userDao.getUserByNameAndPw(userName, passWord);
	}

	@Override
	public T getById(T t, PK id) {
		// TODO Auto-generated method stub
		return (T) userDao.getById(t, id);
	}

}
