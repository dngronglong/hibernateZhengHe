package org.project.beans;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "t_student")
public class StudentBean implements Serializable{
    @Id
    @Column
    @GenericGenerator(name = "stu",strategy = "identity")
    @GeneratedValue(generator = "stu")
    private int id;
    @Column
    private String sex;
    @Column
    private String name;
    @ManyToOne(fetch = FetchType.LAZY)
    @Cascade(value = {org.hibernate.annotations.CascadeType.ALL})
    @JoinColumn(name = "fk_class_id")
    private ClassBean cls;
    public StudentBean() {
    }

    public StudentBean(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public ClassBean getCls() {
        return cls;
    }

    public void setCls(ClassBean cls) {
        this.cls = cls;
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

    @Override
    public String toString() {
        return "StudentBean{" +
                "id=" + id +
                ", sex='" + sex + '\'' +
                ", name='" + name + '\'' +
                ", cls=" + cls +
                '}';
    }
}
