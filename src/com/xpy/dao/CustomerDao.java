package com.xpy.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Expression;

import com.xpy.domain.Customer;
import com.xpy.utils.HibernateUtils;

public class CustomerDao {

	public void insert(Customer customer) {
		Session session = HibernateUtils.getCurrentSession();
		session.save(customer);		
	}
	
	public Customer select(Customer customer) {
		Session session = HibernateUtils.getCurrentSession();
		Criteria criteria = session.createCriteria(Customer.class);
		criteria.add(Expression.eq("phone", customer.getPhone()));
		criteria.add(Expression.eq("userPassword", customer.getUserPassword()));
		List<Customer> list = criteria.list();
		if (!list.isEmpty())
			return list.get(0);
		return null;
	}
}
