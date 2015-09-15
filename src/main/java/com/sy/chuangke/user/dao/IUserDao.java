package com.sy.chuangke.user.dao;

import java.util.List;

import com.sy.chuangke.user.domain.User;

public interface IUserDao {
	User selectByUsername(String username);
	
	void insertUser(User user);
	
	List<User> selectAll();
}
