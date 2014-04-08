package com.youmeek.ssh.service.impl;

import com.youmeek.ssh.dao.UserDaoI;
import com.youmeek.ssh.domain.SysUser;
import com.youmeek.ssh.service.UserServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;

/**
 * @author Judas.n 2014年4月6日 22:49:19
 */
@Service("userService")
public class UserServiceImpl implements UserServiceI {
	
	private UserDaoI userDao;

	public UserDaoI getUserDao() {
		return userDao;
	}

	@Autowired
	public void setUserDao(UserDaoI userDao) {
		this.userDao = userDao;
	}

	@Override
	public Serializable saveUser(SysUser user) {
		return userDao.saveUser(user);
	}

	@Override
	public SysUser getUser(String userId) {
		return userDao.getUser(userId);
	}
}
