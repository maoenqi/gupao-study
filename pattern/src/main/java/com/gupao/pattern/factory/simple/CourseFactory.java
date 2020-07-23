package com.gupao.pattern.factory.simple;

public class CourseFactory {

    public ICourse create(Class clazz) {
        if (null == clazz) {
            return null;
        }
        try {
            return (ICourse) clazz.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}