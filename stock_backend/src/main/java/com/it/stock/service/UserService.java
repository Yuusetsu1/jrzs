package com.it.stock.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.it.stock.pojo.entity.SysUser;
import com.it.stock.vo.req.LoginReqVo;
import com.it.stock.vo.resp.LoginRespVo;
import com.it.stock.vo.resp.R;

import java.util.Map;

/**
 * @author : wuzhixiong
 * @date : 2024/9/19 16:22
 * @description : 定义操纵用户的服务接口
 */
public interface UserService extends IService<SysUser> {
    /**
     * 根据账户名称查询用户信息
     * @param userName
     * @return
     */
    SysUser getUserByUserName(String userName);

    /**
     * 用户登录功能
     * @param reqVo
     * @return
     */
    R<LoginRespVo> login(LoginReqVo reqVo);
    /**
     * 生成验证码
     * @return
     */
    R<Map> getCaptchaCode();
}
