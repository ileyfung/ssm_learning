package com.lifeng.service;

import com.lifeng.dao.UserMapper;
import com.lifeng.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserMapper userMapper;

	public List<User> findAll() {
		List<User> all = userMapper.findAll();
		return all;
	}
}
