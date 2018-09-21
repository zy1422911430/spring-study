package com.test.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @ClassName: DemoListener
 * @Description TODO implements ApplicationListener 接口，通过onApplicationEvent方法监听事件，并拿到消息
 * @Author: zyd
 * @Date: 2018/9/21 9:41
 * @Version: 1.0
 */
@Component
public class DemoListener implements ApplicationListener<DemoEvent> {

    @Override
    public void onApplicationEvent(DemoEvent demoEvent) {
        String msg = demoEvent.getMsg();
        System.out.println("我已经拿到了demoEvent发布的消息："+msg);
    }
}
