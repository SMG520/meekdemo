package com.youmeek.ssh.domain;

import javax.persistence.*;


@Entity
@Table(name = "sys_user", schema = "")
public class SysUser {
	private String userId;
	private String userName;

	@Id
	@Column(name = "user_id")
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	@Basic
	@Column(name = "user_name")
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}
