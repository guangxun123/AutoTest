package com.course.testng.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

/**
 * Created by lenovo on 2019/9/9.
 */
//该类书写公共的方法
public class SuiteConfig {
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("beforesuit运行拉");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("aftersuite运行拉");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("beforeTest运行拉");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("afterTest运行拉");
    }
}
