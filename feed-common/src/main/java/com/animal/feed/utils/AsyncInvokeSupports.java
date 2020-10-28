package com.animal.feed.utils;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Async;

/**
 * Supports --- 异步支持
 *
 * @author wangyp
 * @since 23 April 2020
 */
@Configuration
public class AsyncInvokeSupports {

    @Async
    public void asyncInvoke(Runnable func) {
        func.run();
    }

}
