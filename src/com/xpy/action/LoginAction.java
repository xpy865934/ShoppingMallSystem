package com.xpy.action;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.xpy.domain.Customer;
import com.xpy.service.LoginService;

public class LoginAction extends ActionSupport implements ModelDriven<Customer>{

	private static final long serialVersionUID = -2874033227148905287L;

	private Customer customer = new Customer();
	
	@Override
	public Customer getModel() {
		return customer;
	}
	
	public String login() {
		try {
			Customer result = new LoginService().select(customer);
			HttpServletResponse response = ServletActionContext.getResponse();
			response.setCharacterEncoding("utf-8");
			if(result!=null) {
				ActionContext.getContext().getSession().put("customer", result);
				response.getWriter().println("1");
			}else {
				response.getWriter().println("0");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return NONE;
	}

	

}
