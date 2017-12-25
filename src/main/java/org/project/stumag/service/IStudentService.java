package org.project.stumag.service;

import org.project.beans.StudentBean;

import java.util.List;

public interface IStudentService {
    void addStudent(StudentBean stu);
    StudentBean findById(int id);
    List<?> findAllStudent();
    void updateStudent(StudentBean bean);
    void delStuent(StudentBean bean);

}
