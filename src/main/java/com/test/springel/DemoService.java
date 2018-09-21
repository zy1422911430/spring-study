package com.test.springel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @ClassName: DemoService
 * @Description TODO
 * @Author: zyd
 * @Date: 2018/9/20 17:38
 * @Version: 1.0
 */
@Service
public class DemoService {

    @Value("随便注入什么")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
