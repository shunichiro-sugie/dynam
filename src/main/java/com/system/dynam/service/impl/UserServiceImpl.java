package com.system.dynam.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.system.dynam.dao.UserMapper;
import com.system.dynam.entity.User;
import com.system.dynam.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapper userMapper;
	
	public User getUser(long id) {
		LambdaQueryWrapper<User> wrapper = Wrappers.lambdaQuery();
		wrapper.eq(User::getId, id);
		User user = userMapper.selectOne(wrapper);
		return userMapper.selectOne(wrapper);
	}
}
