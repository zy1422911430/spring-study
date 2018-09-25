package com.test.springTest;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @ClassName: DemoBeanIntegrationTests
 * @Description TODO
 * @Author: zyd
 * @Date: 2018/9/25 10:27
 * @Version: 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)//在Junit环境下，提供spring testContext framework 功能
@ContextConfiguration(classes = {SpringTestConfig.class})//用来加载配置applicationContext ,class属性是用来加载配置类的
@ActiveProfiles("prod")//声明profile
public class DemoBeanIntegrationTests {

    @Autowired
    private SpringTestBean springTestBean;

    @Test
    public void prodBeanTest(){
        String expected = "测试环境bean配置";
        String content = springTestBean.getContent();
        System.out.println(content);
        Assert.assertEquals(content,expected);
    }
}
