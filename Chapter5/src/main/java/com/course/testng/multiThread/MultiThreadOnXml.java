package com.course.testng.multiThread;

import org.testng.annotations.Test;

/**
 * Created by lenovo on 2019/9/10.
 */
public class MultiThreadOnXml {
    @Test
    public void test1(){
        System.out.printf("Thread ID : %s%n",Thread.currentThread().getId());
    }
    @Test
    public void test2(){
        System.out.printf("Thread ID : %s%n",Thread.currentThread().getId());
    }
    @Test
    public void test3(){
        System.out.printf("Thread ID : %s%n",Thread.currentThread().getId());
    }
}
