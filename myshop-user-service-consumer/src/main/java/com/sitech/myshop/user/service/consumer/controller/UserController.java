package com.sitech.myshop.user.service.consumer.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.dubbo.config.annotation.Reference;
import com.sitech.myshop.common.domain.SysUserInfo;
import com.sitech.myshop.user.api.UserService;

@Controller
@RequestMapping
public class UserController {

	@Reference(version = "${user.service.version}")
	private  UserService userService;
	
	@RequestMapping(value = "list")
	public String getAllUser(Model model) {
		
		List<SysUserInfo> sysUserInfo = userService.selectAll();
		model.addAttribute("user", sysUserInfo);
		return "list";
	}
}
