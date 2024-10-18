package com.it.stock.pojo.vo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;


import java.util.List;

/**
 * @author w
 * @Date 2024/12/30  配置股票相关的参数
 * @Description
 */
@ApiModel(description = "")
@ConfigurationProperties(prefix = "stock")
@Data
public class StockInfoConfig {
    //A股大盘ID集合
    @ApiModelProperty(value = "A股大盘ID集合", position = 1)
    private List<String> inner;
    //外盘ID集合
    @ApiModelProperty(value = "外盘ID集合", position = 2)
    private List<String> outer;
    //股票涨幅区间标题集合
    @ApiModelProperty(value = "股票涨幅区间标题集合", position = 3)
    private List<String> upDownRange;
    //大盘参数获取url
    @ApiModelProperty(value = "大盘参数获取url", position = 4)
    private String marketUrl;
    //板块参数获取url
    @ApiModelProperty(value = "板块参数获取url", position = 5)
    private String blockUrl;
}