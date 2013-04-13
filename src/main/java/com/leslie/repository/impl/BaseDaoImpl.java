/**
 * 
 */
package com.leslie.repository.impl;

import java.io.Serializable;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.leslie.repository.BaseDao;

/**
 * @author leslie
 * @time 2013-4-12
 */
@Repository("baseDao")
public abstract class BaseDaoImpl<T extends Serializable, PK extends Serializable>
		implements BaseDao<T, PK> {

	protected EntityManager entityManager;

	@PersistenceContext
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
    
	@Transactional(propagation=Propagation.REQUIRED)
	public void save(T t) {
		// TODO Auto-generated method stub
		entityManager.persist(t);
	}

	public void updata(T t) {
		// TODO Auto-generated method stub
		entityManager.merge(t);
	}

	public void delete(T t) {
		// TODO Auto-generated method stub
		entityManager.remove(t);
	}

}
