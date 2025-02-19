package com.it.stock.mapper;

import com.it.stock.pojo.entity.SysUserRole;

/**
* @author wuzhixiong
* @description 针对表【sys_user_role(用户角色表)】的数据库操作Mapper
* @createDate 2024-09-19 15:48:56
* @Entity com.it.stock.pojo.entity.SysUserRole
*/
public interface SysUserRoleMapper {

    int deleteByPrimaryKey(Long id);

    int insert(SysUserRole record);

    int insertSelective(SysUserRole record);

    SysUserRole selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysUserRole record);

    int updateByPrimaryKey(SysUserRole record);

}
