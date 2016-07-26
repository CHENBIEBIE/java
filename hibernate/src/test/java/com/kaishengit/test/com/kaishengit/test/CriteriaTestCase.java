package com.kaishengit.test.com.kaishengit.test;


import com.kaishengit.pojo.User;
import com.kaishengit.util.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;
import org.junit.Test;

import java.util.List;

public class CriteriaTestCase {

    @Test
    public void testFindAll() {

        Session session = HibernateUtil.getSession();
        session.beginTransaction();

        String hql = "from User";

        Query query =session.createQuery(hql);

        List<User> userList = query.list();

        for (User user : userList) {

            System.out.println(user);
        }

        session.getTransaction().commit();
    }

    @Test
    public void testWhere() {

        Session session = HibernateUtil.getSession();
        session.beginTransaction();

        String hql = "from User where password = :password and username = :username";

        Query query =session.createQuery(hql);
        query.setParameter("password","123123");
        query.setParameter("username","陈恩超");

        List<User> userList = query.list();

        for (User user : userList) {

            System.out.println(user);
        }

        session.getTransaction().commit();
    }

    @Test
    public void testUnique() {

        Session session = HibernateUtil.getSession();
        session.beginTransaction();

        String hql = "from User where password = :pwd";
        Query query = session.createQuery(hql);

        query.setParameter("pwd","110110");

        User user = (User) query.uniqueResult();

        System.out.println(user);

        session.getTransaction().commit();
    }

    @Test
    public void testfindColum() {

        Session session = HibernateUtil.getSession();
        session.beginTransaction();

        String hql = "select id,username,password,address from User";
        Query query = session.createQuery(hql);

        List<Object[]> result = query.list();

        for (Object[] objects : result) {

            System.out.println(objects[0] + "-->" + objects[1] + "-->" + objects[3]);
        }

        session.getTransaction().commit();
    }

    @Test
    public void testCount() {
        Session session = HibernateUtil.getSession();
        session.beginTransaction();

        String hql = "select count(*),max(id) from User";
        Query query = session.createQuery(hql);
        Object[] objects = (Object[]) query.uniqueResult();
        System.out.println("Count:" + objects[0]);
        System.out.println("Max:" + objects[1]);


        session.getTransaction().commit();
    }

    @Test
    public void testPage() {

        Session session = HibernateUtil.getSession();
        session.beginTransaction();

        String hql = "from User order by id desc";
        Query query = session.createQuery(hql);

        query.setFetchSize(3);
        query.setMaxResults(3);//limit 0,3

        List<User> userList = query.list();
        for (User user : userList) {
            System.out.println(user);
        }

        session.getTransaction().commit();
    }
}
