package com.kaishengit.test;

import com.kaishengit.pojo.Student;
import com.kaishengit.pojo.Teacher;
import com.kaishengit.util.HibernateUtil;
import org.hibernate.Session;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Administrator on 2016/7/27.
 */
public class ManyToManyTestCase {

    @Test
    public void testSave() {

        Session session = HibernateUtil.getSession();
        session.beginTransaction();

        Student student = new Student();
        student.setStuname("S5");

        Student student1 = new Student();
        student1.setStuname("S6");

        Teacher teacher = new Teacher();
        teacher.setTeaname("T5");

        Teacher teacher2 = new Teacher();
        teacher2.setTeaname("T6");

        Set<Teacher> teacherSet = new HashSet<>();
        teacherSet.add(teacher);
        teacherSet.add(teacher2);

        student.setTeacherSet(teacherSet);
        student1.setTeacherSet(teacherSet);


        session.save(student);
        session.save(student1);
        session.save(teacher);
        session.save(teacher2);



        session.getTransaction().commit();
    }

    @Test
    public void testFind() {
        Session session = HibernateUtil.getSession();
        session.beginTransaction();

        Teacher teacher = (Teacher) session.get(Teacher.class,18);
        System.out.println(teacher.getTeaname());

        Set<Student> studentSet = teacher.getStudentSet();
        for (Student student : studentSet) {
            System.out.println(student.getId() +":"+ student.getStuname());
        }


        session.getTransaction();
    }
}
