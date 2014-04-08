package com.youmeek.ssh.service;

import com.youmeek.ssh.domain.SysUser;

import java.io.Serializable;

/**
 * @author Judas.n 2014年4月6日 22:49:26
 */
public interface UserServiceI {

	public Serializable saveUser(SysUser user);

	public SysUser getUser(String userId);
	
}
