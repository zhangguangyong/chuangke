package com.sy.chuangke.user.service;

import com.github.pagehelper.PageInfo;
import com.sy.chuangke.user.domain.User;

public interface IUserService {
	
	User getByUsername(String username);
	
	void addUser(User user);
	
	PageInfo<User> getPage(PageInfo<User> pageInfo);
}
