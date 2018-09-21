package com.test.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * @ClassName: TestPrototypeService
 * @Description TODO
 * @Author: zyd
 * @Date: 2018/9/20 17:22
 * @Version: 1.0
 */
@Service
@Scope("prototype")
public class TestPrototypeService {
}
