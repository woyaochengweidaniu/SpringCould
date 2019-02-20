package com.wzkj.example.feign.app;

import com.wzkj.example.feign.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * auhtor:LiuChaomin
 * @Date:2019.2.19
 */
@RestController
public class HelloController {
    @Autowired
    private HelloService service;

    @GetMapping("hello1.do")
    public String hello(){
        return service.hello();
    }
    @PostMapping("hello2.do")
    public String hello2(String name){
        return service.hello(name);
    }
}
