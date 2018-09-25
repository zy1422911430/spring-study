package com.test.assembleAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName: AssembleAnnotationMain
 * @Description TODO
 * @Author: zyd
 * @Date: 2018/9/25 10:01
 * @Version: 1.0
 */
public class AssembleAnnotationMain {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AssembleAnnotationConfig.class);
        AssembleAnnotationService assembleAnnotationService = applicationContext.getBean(AssembleAnnotationService.class);
        assembleAnnotationService.testPrint();
        ((AnnotationConfigApplicationContext) applicationContext).close();
    }
}
