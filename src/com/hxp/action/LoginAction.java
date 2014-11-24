package com.hxp.action;

import java.util.Map;

import javax.annotation.Resource;

import org.apache.struts2.ServletActionContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.hxp.model.User;
import com.hxp.service.UserService;
import com.opensymphony.xwork2.ActionContext;

@Component
@Scope("prototype")//定义为单例
public class LoginAction {
	private UserService userService;
	private User user;

	public User getUser() {
		return user;
	}

	@Resource
	public void setUser(User user) {
		this.user = user;
	}

	public UserService getUserService() {
		return userService;
	}
	
	@Resource
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	public String login(){
		return "index_login";
	}
	
	public String checkLogin(){
		//System.out.println("im in");
		//System.out.println("username:"+user.getName());
		User u = this.userService.loadUser(user);
		if(u != null){
			ActionContext ctx = ServletActionContext.getContext();
			Map session = ctx.getSession(); 
			session.put("user-loged", u);
		}else{
			return "login_fail";
		}
		return "login_success";
	}
	
	public String logout(){
		ActionContext ctx = ServletActionContext.getContext();
		Map session = ctx.getSession(); 
		session.remove("user-loged");
		return "logout";
	}
	
}
