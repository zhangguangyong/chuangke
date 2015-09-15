package com.sy.chuangke.user.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sy.chuangke.user.dao.IUserDao;
import com.sy.chuangke.user.domain.User;
import com.sy.chuangke.user.service.IUserService;

@Service
public class UserServiceImpl implements IUserService{

	@Autowired
	IUserDao userDao;
	
	@Override
	public User getByUsername(String username) {
		return userDao.selectByUsername(username);
	}

	@Override
	public void addUser(User user) {
		userDao.insertUser(user);
	}

	@Override
	public PageInfo<User> getPage(PageInfo<User> pageInfo) {
		PageHelper.startPage(pageInfo.getPageNum(), pageInfo.getPageSize());
		List<User> list = userDao.selectAll();
		pageInfo.setList(list);
		return pageInfo;
	}

}
