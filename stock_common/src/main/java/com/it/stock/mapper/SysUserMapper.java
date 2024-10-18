package com.it.stock.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.it.stock.pojo.entity.SysUser;
import org.apache.ibatis.annotations.Param;

/**
* @author wuzhixiong
* @description 针对表【sys_user(用户表)】的数据库操作Mapper
* @createDate 2024-09-19 15:48:56
* @Entity com.it.stock.pojo.entity.SysUser
*/
public interface SysUserMapper extends BaseMapper<SysUser> {

    /*int insert(SysUser record);

    int insertSelective(SysUser record);

    SysUser selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysUser record);

    int updateByPrimaryKey(SysUser record);

   *//* *
     * 根据用户名查询用户信息
     * @param userName
     * @return*//*

    SysUser getUserByUserName(@Param("userName") String userName);*/
}
