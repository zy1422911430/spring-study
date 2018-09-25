package com.test.aware;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 * @ClassName: AwareService
 * @Description TODO 实现BeanNameAware、ResourceLoaderAware，重写方法setBeanName、setResourceLoader方法，获取容器中的bean name，以及读取test.txt
 * @Author: zyd
 * @Date: 2018/9/21 11:05
 * @Version: 1.0
 */
@Service
public class AwareService implements BeanNameAware,ResourceLoaderAware {

    private String beanName;

    private ResourceLoader resourceLoader;

    @Override
    public void setBeanName(String s) {
        this.beanName = s;
    }

    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.resourceLoader = resourceLoader;
    }

    public void testPrint(){
        System.out.println("获取到的容器bean name 为："+beanName);
        Resource resource = resourceLoader.getResource("classpath:com/test/aware/test.txt");
        try {
            String s = IOUtils.toString(resource.getInputStream());
            System.out.println(s);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
