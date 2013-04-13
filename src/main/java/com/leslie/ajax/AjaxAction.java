/**
 * 
 */
package com.leslie.ajax;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author leslie
 * @time 2013-4-13
 */
public class AjaxAction extends ActionSupport {

	public String hasUser() throws IOException {

		HttpServletResponse response = ServletActionContext.getResponse();

		response.setContentType("application/json;charset=utf-8");

		PrintWriter writer = response.getWriter();

		writer.write("{\"result\":\"has\"}");

		writer.close();

		return null;

	}
}
