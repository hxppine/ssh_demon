package com.hxp.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.hxp.dao.AdminDao;
import com.hxp.model.Admin;

@Component
public class AdminService {
	private AdminDao adminDao;

	public AdminDao getAdminDao() {
		return adminDao;
	}
	@Resource
	public void setAdminDao(AdminDao adminDao) {
		this.adminDao = adminDao;
	}
	
	public Admin loadAdmin(){
		return this.adminDao.getAdmin(null);
	}
	
}
