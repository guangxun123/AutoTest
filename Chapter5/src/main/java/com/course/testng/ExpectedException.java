package com.course.testng;

import org.testng.annotations.Test;

/**
 * Created by lenovo on 2019/9/9.
 */
public class ExpectedException {
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionFailed(){
        System.out.println("这是一个运行会失败的异常测试");
    }
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionSuccess(){
        System.out.println("这是一个会运行成功的异常测试");
        throw new RuntimeException();
    }
}
