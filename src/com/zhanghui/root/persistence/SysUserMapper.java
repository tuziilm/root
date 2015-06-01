package com.zhanghui.root.persistence;

import com.zhanghui.root.domain.SysUser;

/**
 * ibatis操作系统用户表的Mapper接口
 *
 */
public interface SysUserMapper extends BaseMapper<SysUser>{

	SysUser getByUsername(String username);
}