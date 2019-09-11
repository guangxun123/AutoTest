package com.course.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

/**
 * Created by lenovo on 2019/9/9.
 */
public class GroupsOnMethod {
    @Test(groups = "server")
    public void test1(){
        System.out.println("这是服务端测试方法1111");
    }
    @Test(groups = "server")
    public void test2(){
        System.out.println("这是服务端测试方法2222");
    }
    @Test(groups = "client")
    public void test3(){
        System.out.println("这是客户端测试方法3333");
    }
    @Test(groups = "client")
    public void test4(){
        System.out.println("这是客户端测试方法4444");
    }
    @BeforeGroups("server")
    public void beforeGroupsOnServer(){
        System.out.println("这是在服务端组运行之前的运行的方法");
    }
    @AfterGroups("server")
    public void afterGroupsOnServer(){
        System.out.println("这是在服务端组运行之后的运行的方法");
    }
    @BeforeGroups("client")
    public void beforeGroupsient(){
        System.out.println("这是在客户端组运行之前的运行的方法");
    }
    @AfterGroups("client")
    public void afterGroupsOnClient(){
        System.out.println("这是在客户端组运行之后的运行的方法");
    }
}
