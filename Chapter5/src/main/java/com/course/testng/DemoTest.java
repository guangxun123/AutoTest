package com.course.testng;

import org.testng.annotations.Test;

/**
 * Created by lenovo on 2019/9/10.
 */
public class DemoTest {
    @Test
    public void testdemo(){
        System.out.printf("Thread ID : %s%n",Thread.currentThread().getId());
    }
}
