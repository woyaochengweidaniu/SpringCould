package com.wzkj.example.ribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * auhtor:LiuChaomin
 * @Date:2019.2.19
 */
@Service
public class HelloService {
    @Autowired
    private RestTemplate restTemplate;

    public String hello(){
         // restTemplate.getForObject()  get请求
       // restTemplate.postForObject() post请求
       // restTemplate.put();  put请求
       // restTemplate.delete();  delete请求
        //通过restful调用，调用provider的服务
        return restTemplate.getForObject("http://qfprovider/helloprovider1.do",String.class);
    }

    public String hello(String name){
        return restTemplate.postForObject("http://qfprovider/helloprovider2.do",name,String.class);
    }

}
