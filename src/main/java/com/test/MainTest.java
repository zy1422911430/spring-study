package com.test;

import com.test.service.TestService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName: MainTest
 * @Description TODO
 * @Author: zyd
 * @Date: 2018/9/20 16:00
 * @Version: 1.0
 */
public class MainTest {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);
        TestService testService = (TestService)applicationContext.getBean("testService");
        System.out.println(testService.getMsg("hellow"));
        ((AnnotationConfigApplicationContext) applicationContext).close();
    }

}
