package org.project.stumag.dao;

import org.project.beans.StudentBean;

import java.util.List;

public interface IStudentDao {
    void addStudent(StudentBean stu);
    StudentBean findById(int id);
    List<?> findAllStudent();
    void updateStudent(StudentBean bean);
    void delStuent(StudentBean bean);
}
