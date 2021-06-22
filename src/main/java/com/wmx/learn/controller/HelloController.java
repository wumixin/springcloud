package com.wmx.learn.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wmx
 * @date 2021/6/22
 */
@RestController
@RefreshScope
public class HelloController {
    @Value("${config.info}")
    private String configInfo;

    @GetMapping("/config/info")
    public String getConfigInfo(){
        return configInfo;
    }

    @GetMapping("/info")
    public String getInfo(){
        return "info";
    }
}
