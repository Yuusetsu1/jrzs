package com.it.stock.controller;

import com.it.stock.vo.req.LoginReqVo;
import com.it.stock.vo.resp.LoginRespVo;
import com.it.stock.pojo.entity.SysUser;
import com.it.stock.service.UserService;
import com.it.stock.vo.resp.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * @author : wuzhixiong
 * @date : 2024/9/19 16:18
 * @description : 定义访问用户的服务接口
 */
@RestController
@RequestMapping("/api")
@Api(tags = "访问用户的服务接口")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 根据用户名查询用户信息
     * @param userName
     * @return
     */
    @GetMapping("/user/{userName}")
    @ApiOperation(value = "根据用户名查询用户信息")
    @ApiImplicitParams(
            @ApiImplicitParam(name = "name",value = "用户名",dataType = "string",required = true,type = "path")
    )
    public SysUser getUserByUserName(@PathVariable("userName") String userName){
        return userService.getUserByUserName(userName);
    }

    /**
     * 用户登录功能
     * @param reqVo
     * @return
     */
    @PostMapping("/login")
    @ApiOperation(value ="用户登录功能")
    public R<LoginRespVo> login(@RequestBody LoginReqVo reqVo){
        return userService.login(reqVo);
    }

    /**
     * 生成验证码
     * @return
     */
    @ApiOperation("生成验证码")
    @GetMapping("/captcha")
    public R<Map> getCaptchaCode(){
        return userService.getCaptchaCode();
    }

}
