package com.it.stock.service;



import com.it.stock.pojo.domain.*;

import com.it.stock.vo.resp.PageResult;
import com.it.stock.vo.resp.R;

import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;

/**
 * 股票服务接口
 */
public interface StockService {
    /**
     * 获取国内最新大盘指数
     * @return
     */
    R<List<InnerMarketDomain>> getInnerMarketInfo();
    /**
     *需求说明: 获取沪深两市板块最新数据，以交易总金额降序查询，取前10条数据
     * @return
     */
    R<List<StockBlockDomain>> sectorAllLimit();
    /**
     * 分页查询
     *
     * @param page     当前页
     * @param pageSize 每页数量
     * @return
     */
    R<PageResult<StockUpdownDomain>> getStockInfoByPage(Integer page, Integer pageSize);

    R<List<StockUpdownDomain>> getStockInfoByPageS(Integer page, Integer pageSize);
    /**
     * 统计最新交易日下股票每分钟涨跌停的数量
     * @return
     */
    R<Map<String, List>> getStockUpdownCount();
    /**
     * 将指定页的股票数据导出到excel表下
     * @param response
     * @param page  当前页
     * @param pageSize 每页大小
     */
    void exportStockUpDownInfo(HttpServletResponse response, Integer page, Integer pageSize);
    /**
     * 功能描述：统计国内A股大盘T日和T-1日成交量对比功能（成交量为沪市和深市成交量之和）
     *
     * @return
     */
    R<Map<String, List>> getComparedStockTradeAmt();
    /**
     * 查询当前时间下股票的涨跌幅度区间统计功能
     * 如果当前日期不在有效时间内，则以最近的一个股票交易时间作为查询点
     * @return
     */
    R<Map> getIncreaseRangeInfo();

    /**
     * 功能描述：查询单个个股的分时行情数据，也就是统计指定股票T日每分钟的交易数据；
     *         如果当前日期不在有效时间内，则以最近的一个股票交易时间作为查询时间点
     * @param stockCode 股票编码
     * @return
     */
    R<List<Stock4MinuteDomain>> getStockScreenTimeSharing(String stockCode);
    /**
     * 单个个股日K 数据查询 ，可以根据时间区间查询数日的K线数据
     * @param stockCode 股票编码
     */
    R<List<Stock4EvrDayDomain>> getStockScreenDkLine(String stockCode);
}
