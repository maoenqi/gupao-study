package com.gupao.pattern.factory.method;

import com.gupao.pattern.factory.ICourse;

/**
 * com.gupao.pattern.factory.method
 *
 * @author maoenqi
 * @date 2020/7/26
 */
public class FactoryMethodTest {

    public static void main(String[] args) {
        ICourseFactory iCourseFactory = new JavaCourseFactory();
        iCourseFactory.create().record();
        ICourseFactory iCourseFactory2 = new PythonCourseFactory();
        iCourseFactory2.create().record();
    }
}