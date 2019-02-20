package com.wzkj.example.feign.service;

import com.wzkj.example.feign.rpc.HelloRpc;
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
    private HelloRpc helloRpc;

    public String hello(){
        //通过restful调用，调用provider的服务
        return helloRpc.hello();
    }

    public String hello(String name){
        return helloRpc.hello();
    }

}
