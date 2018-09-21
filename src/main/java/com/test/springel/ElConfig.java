package com.test.springel;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;

import java.io.IOException;

/**
 * @ClassName: ElConfig
 * @Description TODO
 * @Author: zyd
 * @Date: 2018/9/20 17:40
 * @Version: 1.0
 */
@Configuration
@ComponentScan("com.test.springel")
@PropertySource("classpath:com/test/springel/test.properties")
public class ElConfig {

    //注入普通字符
    @Value("普通方式")
    private String normal;

    //注入操作系统属性
    @Value("#{systemProperties['os.name']}")
    private String osName;

    //注入表达式结果
    @Value("#{T(java.lang.Math).random()*100}")
    private double randomNumber;

    //注入其它bean属性
    @Value("#{demoService.name}")
    private String fromAnother;

    //注入配置文件
    @Value("${name}")
    private String name;

    //注入配置文件
    @Autowired
    private Environment environment;

    @Value("http://www.baidu.com")
    private Resource testUrl;

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertyConfig(){
        return new PropertySourcesPlaceholderConfigurer();
    }

    public void testPrint(){
        System.out.println(normal);
        System.out.println(osName);
        System.out.println(randomNumber);
        System.out.println(fromAnother);
        System.out.println(name);
        System.out.println(environment.getProperty("age"));
        try {
            System.out.println(IOUtils.toString(testUrl.getInputStream()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ElConfig.class);
        ElConfig bean = applicationContext.getBean(ElConfig.class);
        bean.testPrint();
        ((AnnotationConfigApplicationContext) applicationContext).close();
    }
}
