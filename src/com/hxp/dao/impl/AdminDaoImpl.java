package com.hxp.dao.impl;

import javax.annotation.Resource;

import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.hxp.dao.AdminDao;
import com.hxp.model.Admin;

@Component
public class AdminDaoImpl implements AdminDao {
	
	private HibernateTemplate hibernateTemplate;
	
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	@Resource
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}


	public Admin getAdmin(Admin admin) {
		System.out.println("in daoImpl");
		Admin a = (Admin)this.hibernateTemplate.get(Admin.class, "1");
		return a;
	}

}
