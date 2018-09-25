package com.test.taskScheduler;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName: SchedulerTaskMain
 * @Description TODO
 * @Author: zyd
 * @Date: 2018/9/21 13:43
 * @Version: 1.0
 */
public class SchedulerTaskMain {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ScheduledTaskConfig.class);
        try {
            Thread.sleep(60*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ((AnnotationConfigApplicationContext) applicationContext).close();
    }
}
