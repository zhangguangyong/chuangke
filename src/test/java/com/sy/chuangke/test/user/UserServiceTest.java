package com.sy.chuangke.test.user;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.github.pagehelper.PageInfo;
import com.sy.chuangke.test.BaseTest;
import com.sy.chuangke.user.domain.User;
import com.sy.chuangke.user.service.IUserService;

public class UserServiceTest extends BaseTest {
	
	@Autowired
	IUserService userService;
	
	@Test
	public void testGetByUsername(){
		User user = userService.getByUsername("admin");
		Assert.assertNotNull(user);
		System.out.println(user.getUsername());
	}

	@Test
	public void testAddUser(){
		User user = new User();
		user.setId(10101);
		user.setUsername("ludaxia");
		user.setPassword("jiayou");
		userService.addUser(user);
	}

	@Test
	public void testPage(){
		PageInfo<User> pi = new PageInfo<User>();
		pi.setPageNum(1);
		pi.setPageSize(10);
		userService.getPage(pi);
		System.out.println(pi);
	}
	
}
