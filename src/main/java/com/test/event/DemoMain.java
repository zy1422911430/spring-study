package com.test.event;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName: DemoMain
 * @Description TODO
 * @Author: zyd
 * @Date: 2018/9/21 9:51
 * @Version: 1.0
 */
public class DemoMain {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(DemoConfig.class);
        DemoPublisher demoPublisher = applicationContext.getBean(DemoPublisher.class);
        demoPublisher.publish("事件发布啦！");
        ((AnnotationConfigApplicationContext) applicationContext).close();
    }
}
