package com.xpy.test;

import org.junit.Test;

import com.xpy.utils.HibernateUtils;

public class TestFuction {

	@Test
	public void runCreate() {
		HibernateUtils.getSession();
	}
}
