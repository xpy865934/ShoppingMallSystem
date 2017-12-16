package com.xpy.service;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.xpy.dao.CustomerDao;
import com.xpy.domain.Customer;
import com.xpy.utils.HibernateUtils;

public class RegisterService {

	public void regist(Customer customer) throws Exception {
		Session session = HibernateUtils.getCurrentSession();
		Transaction tr = session.beginTransaction();
		try {
			new CustomerDao().insert(customer);
			tr.commit();
		}catch (Exception e) {
			tr.rollback();
			e.printStackTrace();
			throw new Exception("×¢²áÊ§°Ü");
		}
	}
}
