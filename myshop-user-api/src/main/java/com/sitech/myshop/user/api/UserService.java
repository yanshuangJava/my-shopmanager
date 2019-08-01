package com.sitech.myshop.user.api;

import java.util.List;

import com.sitech.myshop.common.domain.SysUserInfo;

public interface UserService {

	
	public List<SysUserInfo> selectAll();
}
