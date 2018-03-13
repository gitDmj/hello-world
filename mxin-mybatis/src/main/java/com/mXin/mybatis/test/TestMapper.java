package com.mXin.mybatis.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;

import org.apache.commons.lang3.time.DateFormatUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.session.SqlSessionManager;
import org.junit.Before;
import org.junit.Test;

import com.mXin.mybatis.mapper.dao.OrderMapper;
import com.mXin.mybatis.pojo.Order;

public class TestMapper {
	
	private OrderMapper orderMapper;
	
	@Before
	public void setup() throws IOException {
		InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
		SqlSessionFactory sqlSessionFactory = SqlSessionManager.newInstance(inputStream);
//		SqlSessionFactory sqlSessionFactory2 = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession openSession = sqlSessionFactory.openSession(true);
		orderMapper = openSession.getMapper(OrderMapper.class);
	}
	

	@Test
	public void testMapper() throws IOException{
//		String time = DateFormatUtils.format(System.currentTimeMillis(), "yyyy:mm:hh:mm:ss");
//		Order order = new Order(1, 2, 100, time, 20, 0);
//		int insert = orderMapper.insert(order);
//		System.out.println(insert);
		
		Order order = orderMapper.selectByPrimaryKey(1);
		System.out.println(order);
		
	}
	
}
