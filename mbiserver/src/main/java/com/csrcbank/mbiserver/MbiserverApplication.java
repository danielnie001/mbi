package com.csrcbank.mbiserver;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author niehaisheng
 * @date 20210203
 * @descriptor boot启动类
 */
@RestController
@SpringBootApplication
public class MbiserverApplication {

    @RequestMapping("/hello")
    public String sayHello(){
        return "Hello, world";
    }
    @RequestMapping("/hello2")
    public String sayHello2(){
        return "你好！";
    }

    public static void main(String[] args) {
        SpringApplicationBuilder builder = new SpringApplicationBuilder(MbiserverApplication.class);
        builder.application().setAdditionalProfiles("dev");
        builder.run(args);
    }

}
