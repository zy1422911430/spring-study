package com.test.conditional;

import org.springframework.stereotype.Service;

/**
 * @ClassName: LinuxService
 * @Description TODO
 * @Author: zyd
 * @Date: 2018/9/21 14:19
 * @Version: 1.0
 */
@Service
public class LinuxService implements WhichService {

    @Override
    public String showMe() {
        return "Linux command : ls";
    }
}
