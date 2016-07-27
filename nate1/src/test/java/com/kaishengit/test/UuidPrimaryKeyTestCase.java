package com.kaishengit.test;

import com.kaishengit.pojo.Task;
import com.kaishengit.util.HibernateUtil;
import org.hibernate.Cache;
import org.hibernate.LockOptions;
import org.hibernate.Session;
import org.junit.Test;

/**
 * Created by Administrator on 2016/7/27.
 */
public class UuidPrimaryKeyTestCase {

    @Test
    public void testSave() {
        Session session = HibernateUtil.getSession();
        session.beginTransaction();

        Task task = new Task();
        task.setTitle("XX-2200");
        session.save(task);
        session.getTransaction().commit();
    }

    @Test
    public void testUpdate() throws InterruptedException {
        Session session = HibernateUtil.getSession();
        session.beginTransaction();

        Task task = (Task) session.get(Task.class,"40282c81562c005a01562c005c9c0000");
        task.setTitle("x-999");

        Thread.sleep(10000);


        session.getTransaction().commit();
    }

    @Test
    public void testUpdate2() throws InterruptedException {
        Session session = HibernateUtil.getSession();
        session.beginTransaction();

        Task task = (Task) session.get(Task.class,"40282c81562c005a01562c005c9c0000", LockOptions.UPGRADE);
        task.setTitle("x-009");

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                Session session2 = HibernateUtil.getSession();
                session2.beginTransaction();
                Task task1 = (Task) session2.get(Task.class,"40282c81562c005a01562c005c9c0000");
                task1.setTitle("VV-008");
                session2.getTransaction().commit();
            }
        });

        thread.start();

        Thread.sleep(5000);

        session.getTransaction().commit();
    }


    @Test
    public void testFindId() {
        Session session = HibernateUtil.getSession();
        session.beginTransaction();


        Task task = (Task) session.get(Task.class,"40288198562aabb001562aabb3510000");

        //System.out.println(session.contains(task));
        //session.clear(); 持久态 -> 游离态  清空一级缓存
        //session.evict(task); //将指定对象从一级缓存中清除

        session.getTransaction().commit();

        //--------------------------------------
/*
        //将二级缓存清楚
        Cache cache = HibernateUtil.getSessionFactory().getCache();
        //清除指定的
        cache.evictEntityRegion(Task.class);
        //清除所有二级缓存
        cache.evictAllRegions();*/

        Session session2 = HibernateUtil.getSession();
        session2.beginTransaction();

        Task task1 = (Task) session2.get(Task.class,"40288198562aabb001562aabb3510000");
        System.out.println(task1.getTitle());
        session2.getTransaction().commit();
    }
}
