package com.wzkj.example.ribbon.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * auhtor:LiuChaomin
 * @Date:2019.2.19
 */
@Configuration
public class RibbonConfig {
    @Bean
    @LoadBalanced  //负载均衡算法
    public RestTemplate createRT(){
        return  new RestTemplate();
    }
}
