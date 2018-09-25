package com.test.taskExecutor;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @ClassName: TaskExecutorService
 * @Description TODO
 * @Author: zyd
 * @Date: 2018/9/21 11:31
 * @Version: 1.0
 */
@Service
public class TaskExecutorService {

    //声明该方法为异步方法，如果声明在类上，则该类的所有方法均为异步方法
    @Async
    public void executeAsyncTask(int i){
        System.out.println("executeAsyncTask：我在执行异步任务"+i);
    }

    @Async
    public void executeAsyncTaskToo(int i){
        System.out.println("executeAsyncTaskToo：我也在执行异步任务"+i);
    }
}
