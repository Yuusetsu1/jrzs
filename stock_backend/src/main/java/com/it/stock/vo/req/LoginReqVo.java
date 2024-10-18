package com.it.stock.vo.req;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author : wuzhixiong
 * @date : 2024/9/19 17:21
 * @description : 登录时请求参数封装vo-value object view-object
 */
@Data
@ApiModel(description = "登录时请求参数封装")
public class LoginReqVo {
    /**
     * 用户名
     */
    @ApiModelProperty(value ="用户名")
    private String username;
    /**
     * 密码
     */
    @ApiModelProperty(value ="密码")
    private String password;
    /**
     * 验证码
     */
    @ApiModelProperty(value ="验证码")
    private String code;
    /**
     * 会话id
     */
    @ApiModelProperty(value ="会话id")
    private String rkey;
}
