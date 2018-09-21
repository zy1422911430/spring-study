package com.test.beanLifecycle;

import org.springframework.stereotype.Service;

/**
 * @ClassName: BeanWayService
 * @Description TODO @Bean方式指定init、destroy方法
 * @Author: zyd
 * @Date: 2018/9/21 9:07
 * @Version: 1.0
 */
public class BeanWayService {

    public void init(){
        System.out.println("@Bean-init-method");
    }

    public BeanWayService(){
        super();
        System.out.println("初始化构造函数BeanLifecycleService");
    }

    public void destroy(){
        System.out.println("@Bean-destroy-method");
    }
}
