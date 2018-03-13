package com.mXin.mybatis.mapper.dao;

import com.mXin.mybatis.pojo.User;

public interface UserMapper {

	public User selectByUserId(Long id);
	
//	public void insertUser(Long id ,String userName,String password,String email,String phone);
	public void insertUser(User user);
	
	
}
