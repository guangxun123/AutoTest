package com.course.testng;

import org.testng.annotations.Test;

/**
 * Created by lenovo on 2019/9/9.
 */
public class DependTest {
    @Test
    public void test1(){
        System.out.println("test1 运行");
        throw new RuntimeException();
    }
    @Test(dependsOnMethods = {"test1"})
    public void test2(){
        System.out.println("test2 运行");
    }
}
