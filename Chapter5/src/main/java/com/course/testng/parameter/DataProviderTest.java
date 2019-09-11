package com.course.testng.parameter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

/**
 * Created by lenovo on 2019/9/9.
 */
public class DataProviderTest {
    /**
     * 同一个方法，传递多组测试数据
     */
    @Test(dataProvider = "data")
    public void testDataProvider(String name, int age) {
        System.out.println("name= " + name + "; age =" + age);
    }

    @DataProvider(name = "data")
    public Object[][] dataProvider() {
        Object[][] o = new Object[][]{
                {"张三", 10},
                {"李四", 20}
        };
        return o;
    }

    /**
     * 不同方法之间，根据方法名灵活传递测试数据
     */
    @Test(dataProvider = "methodData")
    public void test1(String name, int age) {
        System.out.println("test1的name = " + name + "; age = " + age);
    }

    @Test(dataProvider = "methodData")
    public void test2(String name, int age) {
        System.out.println("test2的name = " + name + "; age = " + age);
    }

    @DataProvider(name = "methodData")
    public Object[][] methodDataTest(Method method) {
        Object[][] result = null;
        if (method.getName().equals("test1")) {
            result = new Object[][]{
                    {"李小锋", 32},
                    {"王周", 40}
            };
        } else if (method.getName().equals("test2")) {
            result = new Object[][]{
                    {"刘忠", 50},
                    {"黄是", 60}
            };
        }
        return result;
    }
}

