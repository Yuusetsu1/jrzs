package com.it.stock.mq;

import com.github.benmanes.caffeine.cache.Cache;
import com.it.stock.service.StockService;
import lombok.extern.slf4j.Slf4j;
import org.joda.time.DateTime;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@Slf4j
public class StockMQMsgListener {
    @Autowired
    private Cache<String,Object> caffeineCache;
    @Autowired
    private StockService stockService;

    @RabbitListener(queues = "innerMarketQueue")
    public void refreshInnerMarketInfo(Date startTime) {
        //获取时间毫秒差值
        long diffTime = DateTime.now().getMillis() - new DateTime(startTime).getMillis();
        //超过一分钟告警
        if (diffTime > 60000l) {
            log.error("采集国内大盘时间点：{},同步超时：{}ms", new DateTime(startTime).toString("yyyy-MM-dd HH:mm:ss"), diffTime);
        }
        //将缓存置为失效删除
        caffeineCache.invalidate("innerMarketKey");
        //调用服务更新缓存
        stockService.getInnerMarketInfo();
    }
}

