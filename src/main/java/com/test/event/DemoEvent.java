package com.test.event;

import org.springframework.context.ApplicationEvent;

/**
 * @ClassName: DemoEvent
 * @Description TODO extends ApplicationEvent ,定义要发布的事件和发布的消息
 * @Author: zyd
 * @Date: 2018/9/21 9:36
 * @Version: 1.0
 */
public class DemoEvent extends ApplicationEvent {

    private String msg;

    public DemoEvent(Object source,String msg){
        super(source);
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
