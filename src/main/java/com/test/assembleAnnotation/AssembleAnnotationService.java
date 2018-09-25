package com.test.assembleAnnotation;

import org.springframework.stereotype.Service;

/**
 * @ClassName: AssembleAnnotationService
 * @Description TODO
 * @Author: zyd
 * @Date: 2018/9/25 9:59
 * @Version: 1.0
 */
@Service
public class AssembleAnnotationService {

    public void testPrint(){
        System.out.println("组合注解测试成功！");
    }
}
