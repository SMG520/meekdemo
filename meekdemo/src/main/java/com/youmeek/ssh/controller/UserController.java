package com.youmeek.ssh.controller;

import com.youmeek.ssh.domain.SysUser;
import com.youmeek.ssh.service.UserServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.UUID;

/**
 * @author Judas.n 2014年4月6日 22:48:22
 */
@Controller
@RequestMapping("/front/userController")
public class UserController {
	private UserServiceI userService;

	public UserServiceI getUserService() {
		return userService;
	}

	@Autowired
	public void setUserService(UserServiceI userService) {
		this.userService = userService;
	}

	/**
	 * 查询用户
	 * @param id
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "getUser", method = RequestMethod.GET)
	public String getUser(String id, HttpServletRequest request) {
		SysUser sysUser = userService.getUser(id);
		request.setAttribute("sysUser", sysUser);
		request.setAttribute("msg", "查询成功");
		return "result";
	}

	/**
	 * 增加用户
	 * @param name
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "saveUser", method = RequestMethod.POST)
	public String saveUser(String name, HttpServletRequest request) {
		SysUser sysUser = new SysUser();
		sysUser.setUserId(UUID.randomUUID().toString());
		sysUser.setUserName(name);
		userService.saveUser(sysUser);
		request.setAttribute("sysUser", sysUser);
		request.setAttribute("msg", "添加成功");
		return "result";
	}

}
