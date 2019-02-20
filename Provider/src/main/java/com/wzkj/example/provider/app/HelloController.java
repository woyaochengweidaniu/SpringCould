package com.wzkj.example.provider.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * auhtor:LiuChaomin
 * @Date:2019.2.19
 */
@RestController
@RefreshScope
public class HelloController {
    @Value("${neo.hellos:dev}")
    private String profile;
    @GetMapping("helloprovider1.do")
    public String hello(){
        return "hello,OK"+"这个值是从远程git上获取的："+profile;
    }
    @PostMapping("helloprovider2.do")
    public String hello(String name){
        return "hello,"+name;
    }

}
