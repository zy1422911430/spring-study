package com.test.beanLifecycle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName: BeanLifecycleConfig
 * @Description TODO
 * @Author: zyd
 * @Date: 2018/9/21 9:14
 * @Version: 1.0
 */
@Configuration
@ComponentScan("com.test.beanLifecycle")
public class BeanLifecycleConfig {

    //使用@Bean注解设定BeanWayService的init、destroy
    @Bean(initMethod = "init",destroyMethod = "destroy")
    BeanWayService beanWayService(){
        return new BeanWayService();
    }

    //jsr方式
    @Bean
    JSR250WayService jsr250WayService(){
        return new JSR250WayService();
    }
}
