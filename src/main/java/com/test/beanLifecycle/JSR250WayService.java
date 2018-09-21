package com.test.beanLifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @ClassName: JSR250WayService
 * @Description TODO jsr的方式指定init、destroy方法
 * @Author: zyd
 * @Date: 2018/9/21 9:10
 * @Version: 1.0
 */
public class JSR250WayService {

    @PostConstruct
    public void init(){
        System.out.println("jsr250-init-method");
    }

    public JSR250WayService(){
        super();
        System.out.println("初始化JSR250WayService构造函数");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("jsr250-destroy-method");
    }

}
