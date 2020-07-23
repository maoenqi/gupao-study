package com.gupao.pattern.factory.simple;

public class SimpleFactoryTest {

    public static void main(String[] args) {
        CourseFactory factory = new CourseFactory();
        factory.create(JavaCourse.class).record();
    }
}