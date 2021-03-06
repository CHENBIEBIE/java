package com.kaishengit.pojo;


import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "t_dept")
public class Dept {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String deptname;

    @OneToMany(mappedBy = "dept")
    private Set<Employee> employeeSet;

    public Set<Employee> getEmployeeSet() {
        return employeeSet;
    }

    public void setEmployeeSet(Set<Employee> employeeSet) {
        this.employeeSet = employeeSet;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "id=" + id +
                ", deptname='" + deptname + '\'' +
                ", employeeSet=" + employeeSet +
                '}';
    }
}
