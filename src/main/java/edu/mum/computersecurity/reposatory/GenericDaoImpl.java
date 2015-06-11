package edu.mum.computersecurity.reposatory;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * 
 *
 */
@SuppressWarnings("unchecked")
@Repository
public abstract class GenericDaoImpl<T> implements GenericDao<T> {

    @Autowired
    private SessionFactory sf;

    public SessionFactory getSf() {
        return sf;
    }

    public void setSf(SessionFactory sf) {
        this.sf = sf;
    }

    protected Class<? extends T> daoType;

    public GenericDaoImpl() {
        Type t = getClass().getGenericSuperclass();
        ParameterizedType pt = (ParameterizedType) t;
        daoType = (Class) pt.getActualTypeArguments()[0];
    }

    @Override
    public T create(T t) {
        sf.getCurrentSession().persist(t);
        return t;
    }

    @Override
    public void delete(int id) {

        T t = (T) sf.getCurrentSession()
                .load(daoType, id);
        if (null != t) {
            sf.getCurrentSession().delete(t);
        }

    }

    @Override
    public T find(int id) {
        return (T) sf.getCurrentSession().get(daoType, id);
    }

    @Override
    public T update(T t) {
        return (T) sf.getCurrentSession().merge(t);
    }

    @Override
    public List<T> getList() {
        return sf.getCurrentSession().createCriteria(daoType).list();
    }

}
