package org.project.beans;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "t_class")
public class ClassBean {
    @Id
    @Column
    @GenericGenerator(name = "cls",strategy = "identity")
    @GeneratedValue(generator = "cls")
    private int id;
    @Column
    private String name;
    @OneToMany(fetch = FetchType.LAZY,mappedBy = "cls")
    @Cascade(value = {org.hibernate.annotations.CascadeType.ALL})
    private Set<StudentBean> stu;

    public ClassBean() {
    }

    public ClassBean(int id, String name, Set<StudentBean> stu) {
        this.id = id;
        this.name = name;
        this.stu = stu;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<StudentBean> getStu() {
        return stu;
    }

    public void setStu(Set<StudentBean> stu) {
        this.stu = stu;
    }

    @Override
    public String toString() {
        return "ClassBean{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", stu=" + stu +
                '}';
    }
}
