package com.test.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName: ScopeTestMain
 * @Description TODO
 * @Author: zyd
 * @Date: 2018/9/20 17:25
 * @Version: 1.0
 */
public class ScopeTestMain {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ScopeConfig.class);
        TestPrototypeService prototypeBean = applicationContext.getBean(TestPrototypeService.class);
        TestPrototypeService prototypeBean1 = applicationContext.getBean(TestPrototypeService.class);
        System.out.println("scope=prototype 的情况下，两个bean是否相等："+(prototypeBean == prototypeBean1));

        TestSingletonService singletonService = applicationContext.getBean(TestSingletonService.class);
        TestSingletonService singletonService1 = applicationContext.getBean(TestSingletonService.class);
        System.out.println("scope=singleton(默认) 的情况下，两个bean是否相等："+(singletonService == singletonService1));
    }
}
