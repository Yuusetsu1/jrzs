package com.it.stock.config;

import com.it.stock.pojo.vo.StockInfoConfig;
import com.it.stock.utils.IdWorker;
import com.it.stock.utils.ParserStockInfoUtil;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @author : wuzhixiong
 * @date : 2024/9/19 17:35
 * @description : 定义公共的配置类
 */
@EnableConfigurationProperties(StockInfoConfig.class)//开启对象相关配置对象的加载
@Configuration
public class CommonConfig {
    /**
     * 定义密码加密匹配器bean
     * @return
     */
    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    /**
     * 配置id生成器bean
     * @return
     */
    @Bean
    public IdWorker idWorker(){
        //基于运维人员对机房和机器的编号规划自行约定
        return new IdWorker(1l,2l);
    }

}
