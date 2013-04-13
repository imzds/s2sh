/**
 * 
 */
package com.leslie.service;

/**
 * @author leslie
 * @time 2013-4-12
 */
public interface BaseService<T, PK> {
	void save(T t);

	void updata(T t);

	void delete(T t);

	T getById(T t, PK id);
}
