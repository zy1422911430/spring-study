package com.test.conditional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName: ConditionConfig
 * @Description TODO
 * @Author: zyd
 * @Date: 2018/9/21 14:20
 * @Version: 1.0
 */
@Configuration
public class ConditionConfig {

    @Bean
    @Conditional(LinuxCondition.class)//如果符合Linux条件，则实例化LinuxService
    public LinuxService linuxService(){
        return new LinuxService();
    }

    @Bean
    @Conditional(WindowsCondition.class)//如果符合Windows条件，则实例化WindowsService
    public WindowsService windowsService(){
        return new WindowsService();
    }
}
