package com.test.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @ClassName: AspectJAopConfig
 * @Description TODO
 * @Author: zyd
 * @Date: 2018/9/20 16:51
 * @Version: 1.0
 */
@Configuration
@ComponentScan("com.test.aop")
@EnableAspectJAutoProxy//开启spring对AspectJ代理的支持
public class AspectJAopConfig {
}
