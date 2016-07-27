package com.kaishengit.test;

import com.kaishengit.pojo.Task;
import com.kaishengit.util.HibernateUtil;
import org.hibernate.Cache;
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
        task.setTitle("001");
        session.save(task);
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
