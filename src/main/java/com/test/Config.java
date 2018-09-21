package com.test;

import com.test.service.TestService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName: Config
 * @Description TODO
 * @Author: zyd
 * @Date: 2018/9/20 16:02
 * @Version: 1.0
 */
//@Configuration//声明当前类为一个配置类
//@ComponentScan("com.test")
public class Config {

    @Bean
    public TestService testService(){
        return new TestService();
    }
}
