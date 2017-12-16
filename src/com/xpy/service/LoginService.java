package com.xpy.service;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.xpy.dao.CustomerDao;
import com.xpy.domain.Customer;
import com.xpy.utils.HibernateUtils;

public class LoginService {

	public Customer select(Customer customer) throws Exception {
		Session session = HibernateUtils.getCurrentSession();
		Transaction tr = session.beginTransaction();
		Customer result= null;
		try {
			result = new CustomerDao().select(customer);
			tr.commit();
		}catch (Exception e) {
			tr.rollback();
			e.printStackTrace();
			throw new Exception("登录时查询用户出错");
		}
		return result; 
		
	}
}
