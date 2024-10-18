package com.it.stock.mapper;

import com.it.stock.pojo.entity.SysRole;

/**
* @author wuzhixiong
* @description 针对表【sys_role(角色表)】的数据库操作Mapper
* @createDate 2024-09-19 15:48:56
* @Entity com.it.stock.pojo.entity.SysRole
*/
public interface SysRoleMapper {

    int deleteByPrimaryKey(Long id);

    int insert(SysRole record);

    int insertSelective(SysRole record);

    SysRole selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysRole record);

    int updateByPrimaryKey(SysRole record);

}
