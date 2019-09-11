package com.course.testng.groups;

import org.testng.annotations.Test;

/**
 * Created by lenovo on 2019/9/9.
 */
@Test(groups = "teacher")
public class GroupsOnClass2 {
    public void teacher1(){
        System.out.println("这是GroupsOnClass2中的teacher1运行");
    }
    public void teacher2(){
        System.out.println("这是GroupsOnClass2中的teacher2运行");
    }
}
