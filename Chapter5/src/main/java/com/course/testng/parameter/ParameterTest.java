package com.course.testng.parameter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * Created by lenovo on 2019/9/9.
 */
public class ParameterTest {
    @Test
    @Parameters({"name","age"})
    public void parameterTest1(String name,int age){
        System.out.println("name =" + name + ";" + "age=" + age);

    }
}
