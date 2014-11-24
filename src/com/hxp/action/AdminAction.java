package com.hxp.action;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.hxp.model.Admin;
import com.hxp.service.AdminService;
import com.opensymphony.xwork2.ActionSupport;

@Component
@Scope("prototype")
public class AdminAction extends ActionSupport{
	private AdminService adminService;
	private Admin admin;
	
	public AdminService getAdminService() {
		return adminService;
	}
	@Resource
	public void setAdminService(AdminService adminService) {
		this.adminService = adminService;
	}
	public Admin getAdmin() {
		return admin;
	}
	@Resource
	public void setAdmin(Admin admin) {
		this.admin = admin;
	}
	
	public String adminIndex(){
		this.admin = this.adminService.loadAdmin();
		return "admin_index";
	}
	
	
}
