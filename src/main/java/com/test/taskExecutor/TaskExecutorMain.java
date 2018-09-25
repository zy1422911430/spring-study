package com.test.taskExecutor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName: TaskExecutorMain
 * @Description TODO
 * @Author: zyd
 * @Date: 2018/9/21 11:36
 * @Version: 1.0
 */
public class TaskExecutorMain {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(TaskExecutorConfig.class);
        TaskExecutorService taskExecutorService = applicationContext.getBean(TaskExecutorService.class);
        for (int i = 0; i < 10; i++) {
            taskExecutorService.executeAsyncTask(i);
            taskExecutorService.executeAsyncTaskToo(i);
        }
        ((AnnotationConfigApplicationContext) applicationContext).close();
    }
}
