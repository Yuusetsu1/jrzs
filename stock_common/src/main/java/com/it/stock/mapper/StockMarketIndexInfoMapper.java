package com.it.stock.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.it.stock.pojo.domain.InnerMarketDomain;
import com.it.stock.pojo.entity.StockMarketIndexInfo;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
* @author wuzhixiong
* @description 针对表【stock_market_index_info(国内大盘数据详情表)】的数据库操作Mapper
* @createDate 2024-09-19 15:48:56
* @Entity com.it.stock.pojo.entity.StockMarketIndexInfo
*/
public interface StockMarketIndexInfoMapper extends BaseMapper<StockMarketIndexInfo> {

    int deleteByPrimaryKey(Long id);

    int insert(StockMarketIndexInfo record);

    int insertSelective(StockMarketIndexInfo record);

    StockMarketIndexInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(StockMarketIndexInfo record);

    int updateByPrimaryKey(StockMarketIndexInfo record);

    /**
     *
     * @param markets 大盘编码集合
     * @param curDate 指定时间
     * @return
     */
    List<InnerMarketDomain> getMarketInfo(@Param("marketIds") List<String> markets, @Param("timePoint") Date curDate);

    /**
     * 根据时间范围和指定的大盘id统计每分钟的交易量
     * @param openDate 交易开始时间
     * @param endDate 结束时间
     * @param marketCodes 大盘id集合
     * @return
     */
    List<Map> getSumAmtInfo(@Param("openDate") Date openDate, @Param("endDate") Date endDate, @Param("marketCodes") List<String> marketCodes);
    /**
     * 批量插入股票大盘数据
     * @param list
     */
    int insertBatch(@Param("infos") ArrayList<StockMarketIndexInfo> list);
}
