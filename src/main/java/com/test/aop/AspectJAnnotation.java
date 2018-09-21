package com.test.aop;

import java.lang.annotation.*;

/**
 * @ClassName: AspectJAnnotation
 * @Description TODO
 * @Author: zyd
 * @Date: 2018/9/20 16:29
 * @Version: 1.0
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface AspectJAnnotation {

    String name();
}
