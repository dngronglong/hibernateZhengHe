package org.project.stumag.service.impl;

import org.project.beans.StudentBean;
import org.project.stumag.dao.IStudentDao;
import org.project.stumag.service.IStudentService;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StudentServiceImpl implements IStudentService {
    @Resource
    private IStudentDao studentDaoImpl;
    @CachePut(value = "stu")
    public void addStudent(StudentBean stu) {
        studentDaoImpl.addStudent(stu);
    }

    @Cacheable(value = "stu")
    public StudentBean findById(int id) {
        return studentDaoImpl.findById(id);
    }
    @Cacheable(value = "stu")
    @Override
    public List<?> findAllStudent() {
        return studentDaoImpl.findAllStudent();
    }
    @CachePut(value = "stu")
    @Override
    public void updateStudent(StudentBean bean) {
        studentDaoImpl.updateStudent(bean);
    }
    @CacheEvict(value = "stu",allEntries = false,beforeInvocation = true)
    @Override
    public void delStuent(StudentBean bean) {
        studentDaoImpl.delStuent(bean);
    }
}
