package com.kaishengit.test;


import com.kaishengit.pojo.Dept;
import com.kaishengit.pojo.Employee;
import com.kaishengit.util.HibernateUtil;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.junit.Test;

import java.util.List;
import java.util.Set;

public class OneToManyTestCase {

    @Test
    public void testSave() {
        Session session = HibernateUtil.getSession();
        session.beginTransaction();

        Dept dept = new Dept();
        dept.setDeptname("万宝路");

        Employee employee1 = new Employee();
        employee1.setEmpname("黎林辉");
        employee1.setDept(dept);

        Employee employee2 = new Employee();
        employee2.setEmpname("李小龙");
        employee2.setDept(dept);

        /*Set<Employee> employees = new HashSet<>();
        employees.add(employee1);
        employees.add(employee2);
        dept.setEmployeeSet(employees);*/

        session.save(dept);
        session.save(employee1);
        session.save(employee2);


        session.getTransaction().commit();
    }

    @Test
    public void testFindDept() {
        Session session = HibernateUtil.getSession();
        session.beginTransaction();

        Dept dept = (Dept) session.get(Dept.class, 23);

        System.out.println(dept.getDeptname());

        Set<Employee> employeeSet = dept.getEmployeeSet();
        for (Employee employee : employeeSet) {
            System.out.println(employee.getEmpname());
        }
        session.getTransaction().commit();
    }

    @Test
    public void testFindEmployee() {
        Session session = HibernateUtil.getSession();
        session.beginTransaction();

        Employee employee = (Employee) session.get(Employee.class,40);
        System.out.println(employee.getEmpname());

        Dept dept = employee.getDept();
        System.out.println(dept.getDeptname());

        session.getTransaction().commit();
    }

    @Test
    public void testFindEmployeeAll() {

        Session session = HibernateUtil.getSession();
        session.beginTransaction();

        Criteria criteria = session.createCriteria(Employee.class);
        List<Employee> employeeList = criteria.list();

        for (Employee employee : employeeList) {
            System.out.println(employee.getId()+ ":" +employee.getEmpname()+ ":" +employee.getDept().getDeptname());
        }

        session.getTransaction().commit();

    }

    @Test
    public void testDel() {
        Session session = HibernateUtil.getSession();
        session.beginTransaction();

        Dept dept = (Dept) session.get(Dept.class,21);
        session.delete(dept);

        session.getTransaction().commit();

    }
}
