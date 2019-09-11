package com.course.testng.groups;

import org.testng.annotations.Test;

/**
 * Created by lenovo on 2019/9/9.
 */
@Test(groups = "stu")
public class GroupsOnClass1 {
    public void stu1(){
        System.out.println("这是GroupsOnClass1中的stu1运行");
    }
    public void stu2(){
        System.out.println("这是GroupsOnClass1中的stu2运行");
    }
}
