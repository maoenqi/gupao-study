package com.gupao.pattern.factory.method;

import com.gupao.pattern.factory.ICourse;
import com.gupao.pattern.factory.JavaCourse;

/**
 * com.gupao.pattern.factory.method
 *
 * @author maoenqi
 * @date 2020/7/25
 */
public class JavaCourseFactory implements ICourseFactory {

    @Override
    public ICourse create() {
        return new JavaCourse();
    }
}