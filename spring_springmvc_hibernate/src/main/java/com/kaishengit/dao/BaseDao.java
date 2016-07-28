package com.kaishengit.dao;


import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import javax.inject.Inject;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

public class BaseDao<T,PK extends Serializable> {

    @Inject
    private SessionFactory sessionFactory;

    private Class<?> entityClass;

    public BaseDao() {
        ParameterizedType parameterizedType = (ParameterizedType) this.getClass().getGenericSuperclass();
        entityClass = (Class<?>) parameterizedType.getActualTypeArguments()[0];
    }

    public Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    public void save(T entity) {
        getSession().saveOrUpdate(entity);
    }

    public void delete(T ebtity) {
        getSession().delete(ebtity);
    }
    public void delete(PK id) {

        delete(findById(id));
    }

    public T findById(PK id) {
       return (T) getSession().get(entityClass,id);
    }

    public List<T> findAll() {
        Criteria criteria = getSession().createCriteria(entityClass);
        return criteria.list();
    }

}
