package com.spring.orm;

import org.springframework.orm.hibernate5.HibernateTemplate;

import javax.transaction.Transactional;

public class DatabaseDaoImpl implements DatabaseDao{
    private HibernateTemplate hibernateTemplate;
    @Transactional
    @Override
    public int insert(Student student) {
        Integer r= (Integer) this.hibernateTemplate.save(student);
        return r;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }
}
