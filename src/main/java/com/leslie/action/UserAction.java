package com.leslie.action;

import javax.inject.Inject;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.leslie.entity.User;
import com.leslie.service.BaseService;
import com.leslie.service.UserService;
import com.opensymphony.xwork2.ActionSupport;

@Controller
@Scope("prototype")
public class UserAction extends ActionSupport {

	private User user;
	private BaseService baseService;
	private UserService userService;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Inject
	public void setBaseService(BaseService baseService) {
		this.baseService = baseService;
	}

	@Inject
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public String addUser() {
		baseService.save(user);
		return "addUser";
	}
}
