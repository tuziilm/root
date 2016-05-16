package com.honest.truth.service;

import com.honest.truth.domain.SysUser;
import com.honest.truth.persistence.SysUserMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 系统用户数据操作服务类
 *
 */
@Service
public class SysUserService  extends SimpleCacheSupportService<SysUser> {
	private SysUserMapper sysUserMapper;
	@Autowired
	public void setSysUserMapper(SysUserMapper sysUserMapper) {
		this.mapper = sysUserMapper;
		this.sysUserMapper=sysUserMapper;
	}

	public SysUser getByUsername(String username) {
		return sysUserMapper.getByUsername(username);
	}
}
