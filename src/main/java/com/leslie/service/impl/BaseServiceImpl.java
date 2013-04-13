/**
 * 
 */
package com.leslie.service.impl;

import java.io.Serializable;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.leslie.repository.BaseDao;
import com.leslie.service.BaseService;

/**
 * @author leslie
 * @time 2013-4-12
 */
@Service("baseService")
public abstract class BaseServiceImpl<T extends Serializable, PK extends Serializable>
		implements BaseService<T, PK> {

	private BaseDao baseDao;
	
	@Inject
	public void setBaseDao(BaseDao baseDao) {
		this.baseDao = baseDao;
	}

	public void save(T t) {
		baseDao.save(t);
	}

	public void updata(T t) {
		baseDao.updata(t);
	}

	public void delete(T t) {
		baseDao.delete(t);
	}

	public abstract T getById(T t, PK id);
}
