package com.test.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @ClassName: TestService
 * @Description TODO
 * @Author: zyd
 * @Date: 2018/9/20 16:01
 * @Version: 1.0
 */
//@Component
public class TestService {

    public String getMsg(String msg){
        return "test service:"+msg;
    }
}
