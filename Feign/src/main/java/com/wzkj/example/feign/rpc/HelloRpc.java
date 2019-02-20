package com.wzkj.example.feign.rpc;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * auhtor:LiuChaomin
 * @Date:2019.2.19
 */
@FeignClient(value = "qfprovider")
public interface HelloRpc {
    @RequestMapping(value = "/helloprovider1.do",method = RequestMethod.GET)
    public String hello();
}
