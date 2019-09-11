package com.course.testng;

import org.testng.annotations.Test;

/**
 * Created by lenovo on 2019/9/11.
 */
public class TimeOutTest {
    @Test(timeOut = 3000)
    public void testSuccess() throws InterruptedException {
        Thread.sleep(2000);
    }
    @Test(timeOut = 2000)
    public void testFailed() throws InterruptedException {
        Thread.sleep(3000);
    }
}
