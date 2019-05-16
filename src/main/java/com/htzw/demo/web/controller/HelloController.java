package com.htzw.demo.web.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author Administrator
 */
@RestController
@Slf4j
@RequestMapping(value = "/poss")
public class HelloController {

    /**
     * 测试方法1
     * @param name 名称
     * @return
     */
    @GetMapping("/hello")
    public String sayHello(String name) {
        log.info("name: " + name);
        return "hello " + name;
    }
    /**
     * 测试方法2
     * @param name 名称
     * @return
     */
    @GetMapping("/test")
    public String sayTest(String name) {
        log.info("name: " + name);
        return "test " + name;
    }
}
