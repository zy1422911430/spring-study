package com.test.beanLifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName: BeanLifecycleMain
 * @Description TODO
 * @Author: zyd
 * @Date: 2018/9/21 9:24
 * @Version: 1.0
 */
public class BeanLifecycleMain {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanLifecycleConfig.class);
        JSR250WayService jsr250WayService = applicationContext.getBean(JSR250WayService.class);
        BeanWayService beanWayService = applicationContext.getBean(BeanWayService.class);
        ((AnnotationConfigApplicationContext) applicationContext).close();
    }
}
