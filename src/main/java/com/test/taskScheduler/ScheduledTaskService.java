package com.test.taskScheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * @ClassName: ScheduledTaskService
 * @Description TODO
 * @Author: zyd
 * @Date: 2018/9/21 11:50
 * @Version: 1.0
 */
@Service
public class ScheduledTaskService {

    @Scheduled(fixedRate = 1000)
    public void fixedRateTaskExecutor() {
        System.out.println("每隔1s执行一次任务");
    }

    @Scheduled(cron = "0 51 13 ? * *")
    public void fixedTimeTaskExecutor() {
        System.out.println("指定时间执行一次任务");
    }
}
