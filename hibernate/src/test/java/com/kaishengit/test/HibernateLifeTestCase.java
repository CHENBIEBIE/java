package com.kaishengit.test;

import com.kaishengit.pojo.User;
import com.kaishengit.util.HibernateUtil;
import org.hibernate.Session;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Administrator on 2016/7/26.
 */
public class HibernateLifeTestCase {

    @Test
    public void testSave(){

        Session session = HibernateUtil.getSession();
        session.beginTransaction();

        User user = new User();
        user.setUsername("张三");
        user.setPassword("123456");
        /*session.save(user);*/
        session.persist(user);

        System.out.println(user.getId());

        session.getTransaction().commit();

    }

    @Test
    public void testFindByGet(){

        Session session = HibernateUtil.getSession();
        session.beginTransaction();

        User user = (User) session.get(User.class,6);



        session.getTransaction().commit();

        Assert.assertNull(user);
    }

    @Test
    public void testFindByLoad(){

        Session session = HibernateUtil.getSession();
        session.beginTransaction();

        User user = (User) session.load(User.class,55);
        System.out.println(user==null);


        session.getTransaction().commit();

    }

    @Test
    public void testUpdate(){

        Session session = HibernateUtil.getSession();
        session.beginTransaction();

        User user = (User) session.get(User.class,6);

        session.getTransaction().commit();

        Session session1 = HibernateUtil.getSession();
        session1.beginTransaction();

        session1.update(user);

        session1.getTransaction().commit();


    }

    @Test
    public void testSaveOrUpdate(){


        Session session = HibernateUtil.getSession();
        session.beginTransaction();

        User user = new User();
        user.setUsername("陈恩超");
        user.setPassword("123123");
        session.saveOrUpdate(user);

        session.getTransaction().commit();

        user.setPassword("110110");
        Session session1 = HibernateUtil.getSession();
        session1.beginTransaction();

        session1.saveOrUpdate(user);

        session1.getTransaction().commit();

    }

    @Test
    public void testMerge(){

        Session session = HibernateUtil.getSession();
        session.beginTransaction();

        /*User user = new User();
        user.setUsername("陈恩超");
        user.setPassword("123123");
        session.merge(user);*/
        User user = (User) session.get(User.class,21);

        session.getTransaction().commit();


        user.setPassword("123456");

        Session session2 = HibernateUtil.getSession();
        session2.beginTransaction();

        session2.merge(user);

        session2.getTransaction().commit();

    }

    @Test
    public void testDelete() {
        Session session = HibernateUtil.getSession();
        session.beginTransaction();

        User user = (User) session.get(User.class,6);
        //session.delete(user);

        session.getTransaction().commit();

        Session session2 = HibernateUtil.getSession();
        session2.beginTransaction();

        session2.delete(user);

        session2.getTransaction().commit();
    }

    @Test
    public void testClear() {

        Session session = HibernateUtil.getSession();
        session.beginTransaction();

        User user = (User) session.get(User.class,12);
        //session.clear();
        user.setPassword("321321");
        session.flush(); //将对象的变化立即同步到数据库中


        session.getTransaction().commit();

    }


}
