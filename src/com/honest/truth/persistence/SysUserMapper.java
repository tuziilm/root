package com.honest.truth.persistence;

import com.honest.truth.domain.SysUser;

/**
 * ibatis����ϵͳ�û����Mapper�ӿ�
 *
 */
public interface SysUserMapper extends BaseMapper<SysUser>{

	SysUser getByUsername(String username);
}