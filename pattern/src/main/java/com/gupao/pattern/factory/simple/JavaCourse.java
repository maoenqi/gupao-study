package com.gupao.pattern.factory.simple;

public class JavaCourse implements ICourse {
    @Override
    public void record() {
        System.out.println("Java Course");
    }
}