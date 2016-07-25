package com.kaishengit.test;


import com.kaishengit.pojo.User;
import com.kaishengit.util.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.junit.Test;

import java.util.List;

public class HibernateTestCase {

    @Test
    public void testSave() {

        Configuration configuration = new Configuration().configure();

        ServiceRegistry registry =new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();

        SessionFactory sessionFactory = configuration.buildSessionFactory(registry);

        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();

        User user = new User();
        user.setUsername("黎林辉");
        user.setAddress("中国");
        user.setPassword("1211");
        session.save(user);

        transaction.commit();
    }

    @Test
    public void testFindById() {

        Session session = HibernateUtil.getSession();
        session.beginTransaction();

        User user = (User) session.get(User.class,15);
        System.out.println(user.getUsername());

        session.getTransaction().commit();
    }


    @Test
    public void testUpdate() {

        Session session = HibernateUtil.getSession();
        session.beginTransaction();

        User user = (User) session.get(User.class,15);

        user.setPassword("123456");
        session.getTransaction().commit();

    }

    @Test
    public void testDel() {
        Session session = HibernateUtil.getSession();
        session.beginTransaction();

        User user = (User) session.get(User.class,2);
        session.delete(user);

        session.getTransaction().commit();

    }

    @Test
    public void testFindAll() {

        Session session = HibernateUtil.getSession();
        session.beginTransaction();

        String hql = "from User";
        Query query = session.createQuery(hql);

        List<User> userList = query.list();

        for (User user : userList){
            System.out.println(user.getId() + "-->" + user.getUsername());
        }

        session.getTransaction().commit();
    }
}
