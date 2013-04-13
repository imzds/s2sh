/**
 * 
 */
package com.leslie.service;

import com.leslie.entity.User;

/**
 * @author leslie
 * @time 2013-4-12
 */
public interface UserService<T, PK> extends BaseService<T, PK> {

	User getUserByName(final String userName);

	User getUserByNameAndPw(final String userName, String passWord);

}
