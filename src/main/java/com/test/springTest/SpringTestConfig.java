package com.test.springTest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @ClassName: SpringTestConfig
 * @Description TODO
 * @Author: zyd
 * @Date: 2018/9/25 10:22
 * @Version: 1.0
 */
@Configuration
public class SpringTestConfig {

    @Bean
    @Profile("dev")
    public SpringTestBean devSpringTestBean(){
        return new SpringTestBean("测试环境bean配置");
    }

    @Bean
    @Profile("prod")
    public SpringTestBean prodSpringTestBean(){
        return new SpringTestBean("生产环境bean配置");
    }
}
