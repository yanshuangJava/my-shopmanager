package com.sitech.myshop.user.service.provider.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.sitech.myshop.common.domain.SysUserInfo;
import com.sitech.myshop.mapper.SysUserInfoMapper;
import com.sitech.myshop.user.api.UserService;

@Service(version = "${user.service.version}")
public class UserServiceImpl implements UserService {

	@Autowired
	private SysUserInfoMapper  sysUserInfoMapper;
	
	@Override
	@HystrixCommand(commandProperties = {
            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value = "10"),
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "20000")
            
    },fallbackMethod = "error" )
	public List<SysUserInfo> selectAll() {
		System.out.println("我已经到达。。。。");
		List<SysUserInfo> list= null;
		try {
			list = sysUserInfoMapper.selectAll();
			for(SysUserInfo s:list) {
				System.out.println(s.getName());
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return list;
	}
	
	public List<SysUserInfo> error(){
		return null;
	}

}
