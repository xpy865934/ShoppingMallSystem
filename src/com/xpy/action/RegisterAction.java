package com.xpy.action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.xpy.domain.Customer;
import com.xpy.service.RegisterService;

public class RegisterAction extends ActionSupport implements ModelDriven<Customer>{

	private static final long serialVersionUID = 4002574759886667223L;
	
	private Customer customer= new Customer();
	
	@Override
	public Customer getModel() {
		return customer;
	}

	public String regist() {
		try {
			new RegisterService().regist(customer);
			ActionContext actionContext = ActionContext.getContext();
			Map<String, Object> session = actionContext.getSession();
			session.put("customer", customer);
		} catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		}
		return "index";
	}


}
