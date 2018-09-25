package com.test.conditional;

import org.springframework.stereotype.Service;

/**
 * @ClassName: WindowsService
 * @Description TODO
 * @Author: zyd
 * @Date: 2018/9/21 14:18
 * @Version: 1.0
 */
@Service
public class WindowsService implements WhichService {

    @Override
    public String showMe() {
        return "Windows command : dir";
    }
}
