package com.test.aware;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName: AwareMain
 * @Description TODO
 * @Author: zyd
 * @Date: 2018/9/21 11:16
 * @Version: 1.0
 */
public class AwareMain {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AwareConfig.class);
        AwareService awareService = applicationContext.getBean(AwareService.class);
        awareService.testPrint();
        ((AnnotationConfigApplicationContext) applicationContext).close();
    }
}
