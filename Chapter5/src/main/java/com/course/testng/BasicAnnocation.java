package com.course.testng;

import org.testng.annotations.*;

/**
 * Created by lenovo on 2019/9/8.
 */
public class BasicAnnocation {
    //最基本的注解，用于标记方法是测试的一部分
    @Test
    public void testCase1(){
        System.out.println("Test这是测试用例1");
    }
    @Test
    public void testCase2(){
        System.out.println("Test这是测试用例2");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("BeforeMethod是在测试方法之前运行的");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("AfterMethod是在测试方法之后运行的");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("beforeClass是类运行之前运行的方法");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("afterClass是类运行之后运行的方法");
    }
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("beforeSuite测试套件");
    }
    @AfterSuite
    public void afterSuite(){System.out.println("afterSuite测试套件");}
}
