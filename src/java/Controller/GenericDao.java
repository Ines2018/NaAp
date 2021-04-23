/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Util.HibernateUtil;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Ineza
 */
public class GenericDao<X> {
    private Class<X> type;

    public GenericDao(Class<X> type) {
        this.type = type;
    }

    public void create(X obj) {
        Session ss = HibernateUtil.getSessionFactory().openSession();
        ss.beginTransaction();
        ss.save(obj);
        ss.getTransaction().commit();
        ss.close();
    }

    public void update(X obj) {
        Session ss = HibernateUtil.getSessionFactory().openSession();
        ss.beginTransaction();
        ss.update(obj);
        ss.getTransaction().commit();
        ss.close();
    }

    public void delete(X obj) {
        //the same as update and create
        Session ss = HibernateUtil.getSessionFactory().openSession();
        ss.beginTransaction();
        ss.delete(obj);
        ss.getTransaction().commit();
        ss.close();
    }

    public X findById(String id) {
        Session ss = HibernateUtil.getSessionFactory().openSession();
        ss.beginTransaction();
        X obj = (X) ss.get(type, id);
        ss.getTransaction().commit();
        ss.close();
        return obj;
    }
    
     public X findByName(String name) {
        Session ss = HibernateUtil.getSessionFactory().openSession();
        ss.beginTransaction();
        X obj = (X) ss.get(type,name );
        ss.getTransaction().commit();
        ss.close();
        return obj;
    }

    public List<X> findAll() {
        Session ss = HibernateUtil.getSessionFactory().openSession();
        ss.beginTransaction();
        Query q = ss.createQuery("from " + type.getName());//this differs from findByname kuko yo ijya muri hibernate config while indi ijya mu ma class
        List<X> list = q.list();
        ss.getTransaction().commit();
        ss.close();
        return list;
    }

    
}
