package com.test.aop;

import org.springframework.stereotype.Service;

/**
 * @ClassName: DemoService
 * @Description TODO
 * @Author: zyd
 * @Date: 2018/9/20 16:32
 * @Version: 1.0
 */
@Service
public class DemoAnnotationService {

    @AspectJAnnotation(name = "注解式拦截成功！")
    public void test(){}
}
