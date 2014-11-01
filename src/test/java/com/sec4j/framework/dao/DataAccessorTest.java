package com.sec4j.framework.dao;

import org.junit.Test;

import junit.framework.TestCase;

import com.sec4j.framework.dao.impl.DefaultDataAccessor;

public class DataAccessorTest extends TestCase{
	private DataAccessor da = new DefaultDataAccessor();
	
	@Test
	public void testQueryCount(){
		long count = da.queryCount("SELECT COUNT(*) FROM user");
		assertEquals(2,count);
	}
	
}
