package com.test.conditional;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName: ConditionMain
 * @Description TODO
 * @Author: zyd
 * @Date: 2018/9/21 14:24
 * @Version: 1.0
 */
public class ConditionMain {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConditionConfig.class);
        WhichService whichService = applicationContext.getBean(WhichService.class);
        System.out.println("当前系统环境为"+applicationContext.getEnvironment().getProperty("os.name")+",执行结果为："+whichService.showMe());
        ((AnnotationConfigApplicationContext) applicationContext).close();
    }
}
