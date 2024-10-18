package com.it.stock.mapper;

import com.it.stock.pojo.entity.SysLog;

/**
* @author wuzhixiong
* @description 针对表【sys_log(系统日志)】的数据库操作Mapper
* @createDate 2024-09-19 15:48:56
* @Entity com.it.stock.pojo.entity.SysLog
*/
public interface SysLogMapper {

    int deleteByPrimaryKey(Long id);

    int insert(SysLog record);

    int insertSelective(SysLog record);

    SysLog selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysLog record);

    int updateByPrimaryKey(SysLog record);

}
