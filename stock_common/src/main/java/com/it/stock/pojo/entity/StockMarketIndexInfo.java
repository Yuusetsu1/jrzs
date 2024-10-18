package com.it.stock.pojo.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 国内大盘数据详情表
 * @TableName stock_market_index_info
 */
@ApiModel(description = "国内大盘数据详情表")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StockMarketIndexInfo implements Serializable {
    /**
     * 主键字段（无业务意义）
     */
    @ApiModelProperty(value = "主键字段（无业务意义）", position = 1)
    private Long id;

    /**
     * 大盘编码
     */
    @ApiModelProperty(value = "大盘编码", position = 2)
    private String marketCode;

    /**
     * 指数名称
     */
    @ApiModelProperty(value = "指数名称", position = 3)
    private String marketName;

    /**
     * 前收盘点数
     */
    @ApiModelProperty(value = "前收盘点数", position = 4)
    private BigDecimal preClosePoint;

    /**
     * 开盘点数
     */
    @ApiModelProperty(value = "开盘点数", position = 5)
    private BigDecimal openPoint;

    /**
     * 当前点数
     */
    @ApiModelProperty(value = "当前点数", position = 6)
    private BigDecimal curPoint;

    /**
     * 最低点数
     */
    @ApiModelProperty(value = "最低点数", position = 7)
    private BigDecimal minPoint;

    /**
     * 最高点数
     */
    @ApiModelProperty(value = "最高点数", position = 8)
    private BigDecimal maxPoint;

    /**
     * 成交量(手)
     */
    @ApiModelProperty(value = "成交量(手)", position = 9)
    private Long tradeAmount;

    /**
     * 成交金额（元）
     */
    @ApiModelProperty(value = "成交金额（元）", position = 10)
    private BigDecimal tradeVolume;

    /**
     * 当前时间
     */
    @ApiModelProperty(value = "当前时间", position = 11)
    private Date curTime;

    private static final long serialVersionUID = 1L;
}