package com.test.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @ClassName: TestAspectJMain
 * @Description TODO
 * @Author: zyd
 * @Date: 2018/9/20 16:38
 * @Version: 1.0
 */
@Component
@Aspect//声明一个切面
public class TestAspectJMain {

    @Pointcut("@annotation(com.test.aop.AspectJAnnotation)")//声明切点
    public void annotationPointCut(){}

    @After("annotationPointCut()")//声明一个建言 advice，并使用pointcut定义的切点
    public void after(JoinPoint joinPoint){
        MethodSignature methodSignature = (MethodSignature)joinPoint.getSignature();
        Method method = methodSignature.getMethod();
        AspectJAnnotation annotation = method.getAnnotation(AspectJAnnotation.class);
        System.out.println("注解式拦截"+annotation.name());//反射获取注解上的属性
    }

    @Before("execution(* com.test.aop.DemoMethodService.*(..))")//声明一个建言，直接使用拦截规则作为参数
    public void before(JoinPoint joinPoint){
        MethodSignature methodSignature = (MethodSignature)joinPoint.getSignature();
        Method method = methodSignature.getMethod();
        System.out.println("方法规则拦截"+method.getName());
    }

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AspectJAopConfig.class);
        DemoAnnotationService demoAnnotationService = (DemoAnnotationService)applicationContext.getBean("demoAnnotationService");
        demoAnnotationService.test();
        DemoMethodService demoMethodService = (DemoMethodService)applicationContext.getBean("demoMethodService");
        demoMethodService.test();
        ((AnnotationConfigApplicationContext) applicationContext).close();
    }
}
