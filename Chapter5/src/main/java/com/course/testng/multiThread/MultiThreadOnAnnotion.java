package com.course.testng.multiThread;

import org.testng.annotations.Test;

/**
 * Created by lenovo on 2019/9/10.
 */
public class MultiThreadOnAnnotion {
    @Test(invocationCount = 10,threadPoolSize = 10)
    public void test1(){
        System.out.printf("Thread ID : %s%n",Thread.currentThread().getId());
        System.out.println(1);

    }
}
