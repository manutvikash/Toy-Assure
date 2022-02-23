package com.increff.assure.dao;


import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

public abstract class AbstractDao<T> {
	
	@PersistenceContext
	private EntityManager em;
		
	private Class<T> clazz;
	public AbstractDao() {
		this.clazz=(Class<T>)((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
	}
	protected T getSingle(TypedQuery<T> query) {
		return query.getResultList().stream().findFirst().orElse(null);
	}
	
	protected TypedQuery<T> getQuery(String jpql) {
		return em.createQuery(jpql, clazz);
	}
	
	protected EntityManager em() {
		return em;
	}

	public void insert(T t) {
		em.persist(t);
	}
	public void update(T t) {
		
	}
	public T select(Long id) {
		return em.find(clazz, id);
	}
    public List<T> selectAll(){
    	return em.createQuery("from"+clazz.getName()).getResultList();
    }

}
