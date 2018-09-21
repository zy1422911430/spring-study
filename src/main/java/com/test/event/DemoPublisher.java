package com.test.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @ClassName: DemoPublisher
 * @Description TODO 发布DemoEvent事件
 * @Author: zyd
 * @Date: 2018/9/21 9:47
 * @Version: 1.0
 */
@Component
public class DemoPublisher {

    //注入applicationContext用来发布事件
    @Autowired
    ApplicationContext applicationContext;

    //定义publish方法，使用applicationContext.publishEvent方法发布事件
    public void publish(String msg){
        applicationContext.publishEvent(new DemoEvent(this,msg));
    }

}
