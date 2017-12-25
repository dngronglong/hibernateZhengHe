package org.project.stumag.dao.impl;

import org.hibernate.Query;
import org.project.base.BaseDao;
import org.project.beans.StudentBean;
import org.project.stumag.dao.IStudentDao;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentDaoImpl extends BaseDao implements IStudentDao {

    public void addStudent(StudentBean stu) {
        getSession().save(stu);
    }

    @Override
    public StudentBean findById(int id) {
        return (StudentBean) getSession().get(StudentBean.class,id);
    }

    @Override
    public List<?> findAllStudent() {
        String hql="From StudentBean as stu left join fetch stu.cls as c";
        Query query=getSession().createQuery(hql);
        return query.list();
    }

    @Override
    public void updateStudent(StudentBean bean) {
        getSession().update(bean);
    }

    @Override
    public void delStuent(StudentBean bean) {
        getSession().delete(bean);
    }
}
