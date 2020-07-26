package com.gupao.pattern.factory.simple;

import com.gupao.pattern.factory.JavaCourse;

/**
 * @author maoenqi
 */
public class SimpleFactoryTest {

    public static void main(String[] args) {
        CourseFactory factory = new CourseFactory();
        factory.create(JavaCourse.class).record();
    }
}