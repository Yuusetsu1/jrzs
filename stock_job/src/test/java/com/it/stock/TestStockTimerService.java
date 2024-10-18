package com.it.stock;

import com.it.stock.service.StockTimerTaskService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author w
 * @Date 2022/1/1
 * @Description
 */
@SpringBootTest
public class TestStockTimerService {
    @Autowired
    private StockTimerTaskService stockTimerService;

    /**
     * 获取大盘数据
     */
    @Test
    public void test01(){
        stockTimerService.getInnerMarketInfo();
     /*   stockTimerService.getStockRtIndex();*/
       /* stockTimerService.getStockSectorRtIndex();*/
    }
}    