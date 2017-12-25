package org.project;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.project.beans.ClassBean;
import org.project.beans.StudentBean;
import org.project.stumag.service.IStudentService;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:applicationContext.xml"})
public class TestStu {
    @Resource
    private IStudentService studentServiceImpl;
    @Test
    public void addStu(){
        StudentBean stu=new StudentBean();
        ClassBean cls=new ClassBean();
        cls.setName("二班");
        stu.setName("sdsadasdsad");
        stu.setSex("sdsad");
        stu.setCls(cls);
        studentServiceImpl.addStudent(stu);
    }
    @Test
    public void findAllStu(){
        System.out.println(studentServiceImpl.findAllStudent());
    }
    @Test
    public void findById(){
        System.out.println(studentServiceImpl.findById(18));
    }
    @Test
    public void updateStu(){
        StudentBean stu=new StudentBean();
        ClassBean cls=new ClassBean();
        cls.setName("二班");
        stu.setName("小红");
        stu.setSex("女");
        stu.setId(20);
        stu.setCls(cls);
        studentServiceImpl.updateStudent(stu);
    }
    @Test
    public void delStu(){
        StudentBean bean=new StudentBean();
        bean.setId(19);
        studentServiceImpl.delStuent(bean);
    }
}
