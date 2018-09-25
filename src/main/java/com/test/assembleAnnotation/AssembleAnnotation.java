package com.test.assembleAnnotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.lang.annotation.*;

/**
 * @ClassName: AssembleAnnotation
 * @Description TODO
 * @Author: zyd
 * @Date: 2018/9/25 9:55
 * @Version: 1.0
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Configuration
@ComponentScan
public @interface AssembleAnnotation {

    String[] value() default {};
}
