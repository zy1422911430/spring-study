package com.test.taskScheduler;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @ClassName: ScheduledTaskConfig
 * @Description TODO
 * @Author: zyd
 * @Date: 2018/9/21 13:43
 * @Version: 1.0
 */
@Configuration
@ComponentScan("com.test.taskScheduler")
@EnableScheduling//开启spring对schedule的支持
public class ScheduledTaskConfig {
}
