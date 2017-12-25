package org.project.base;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class BaseDao {
    @Resource
    private SessionFactory sessionFactory;
    /**
     * 定义一个构造方法之后，需要立即执行一个初始方法
     */
    public Session  getSession(){
        return sessionFactory.getCurrentSession();
    }
}
