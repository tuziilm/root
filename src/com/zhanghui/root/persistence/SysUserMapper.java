package com.zhanghui.root.persistence;

import com.zhanghui.root.domain.SysUser;

/**
 * ibatis����ϵͳ�û����Mapper�ӿ�
 *
 */
public interface SysUserMapper extends BaseMapper<SysUser>{

	SysUser getByUsername(String username);
}