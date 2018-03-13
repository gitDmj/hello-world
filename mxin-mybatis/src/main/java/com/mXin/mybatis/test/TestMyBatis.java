package com.mXin.mybatis.test;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.mXin.mybatis.mapper.dao.UserMapper;
import com.mXin.mybatis.pojo.User;

public class TestMyBatis {
// 	static Logger logger = Logger.getRootLogger();

	public static void main(String[] args) throws IOException {

		
	String resource = "mybatis-config.xml";
	InputStream inputStream = Resources.getResourceAsStream(resource);
	SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
	
	SqlSession sqlSession = sqlSessionFactory.openSession();
	UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
	User user = userMapper.selectByUserId(1L);
	String userStr = user.toString();
//	logger.info(userStr);
	System.out.println(userStr);
	User userForInsert = new User(null,"mdjAgain","weiJiaMi","18888888888","188888888888@188.com");
	userMapper.insertUser(
//			userForInsert.getId(),
//			userForInsert.getUsername(),
//			userForInsert.getPassword(),
//			userForInsert.getEmail(),
//			userForInsert.getPhone()
			userForInsert
			);
	User user2 = userMapper.selectByUserId(2L);
	System.out.println(user2.toString());
//	logger.info(user2.toString());
	
	sqlSession.close();
	}
}
