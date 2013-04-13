/**
 * 
 */
package com.leslie.ajax;

import java.io.IOException;
import java.io.PrintWriter;

import javax.inject.Inject;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.leslie.entity.User;
import com.leslie.service.BaseService;
import com.leslie.service.UserService;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author leslie
 * @time 2013-4-13
 */
public class AjaxAction extends ActionSupport {

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

	public String hasUser() throws IOException {

		user = userService.getUserByName(user.getUserName());

		HttpServletResponse response = ServletActionContext.getResponse();

		response.setContentType("application/json;charset=utf-8");

		PrintWriter writer = response.getWriter();

		if (user == null) {
			writer.write("{\"result\":\"no\"}");
		}

		writer.write("{\"result\":\"has\"}");

		writer.close();

		return null;

	}
}
